package dl;

import bl.VideoGameRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;;

public class VideoGameCSVReader {

    final static Logger logger =  LogManager.getLogger(VideoGameCSVReader.class);

    /**
     * Reads the records from the csv file,
     * save them inside a videoGameRecordObject
     * and ad it into a colection to be used by the function creating
     * JSON Queue
     * @param sileNamePath
     * @return
     */
    public List getVideoGamesListFromCsv(String sileNamePath){
        List<VideoGameRecord> videoGamesList = new LinkedList();
        String row;
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(sileNamePath));
            while ((row = csvReader.readLine()) != null) {
                String[] gameRecord = row.split(",");

                int gameRank = Integer.parseInt(gameRecord[0]) ;
                VideoGameRecord videoGameRecord= new VideoGameRecord(
                        gameRank,gameRecord[1],
                        gameRecord[2],
                        gameRecord[3],
                        gameRecord[4],
                        gameRecord[5],
                        Double.parseDouble(gameRecord[6]),
                        Double.parseDouble(gameRecord[7]),
                        Double.parseDouble(gameRecord[8]),
                        Double.parseDouble(gameRecord[9]),
                      Double.parseDouble(gameRecord[11])
                );

                videoGamesList.add(videoGameRecord);
            }
            csvReader.close();
        }catch(IOException ioe){
            logger.debug("Error reading the CSV file");
            logger.debug(ioe.getMessage());
        }


        return videoGamesList;

    }


}
