package bl;

import com.google.gson.Gson;

import java.util.Queue;

public class VideoGamesRecordConsumer {

    /**
     * to create VideoGame Record from
     * Json String
     * @param jsonString
     * @return
     */
    private  VideoGameRecord getRecordfromJSON(String jsonString){
        Gson gson = new Gson();
        VideoGameRecord VideoGameRecord = gson.fromJson(jsonString, VideoGameRecord.class);

        return VideoGameRecord;
    }

    /**
     * takes the whole queue of game records
     * for each ear produces the total sale of each game
     * @param year
     * @param gamesList
     * @return
     */
    public double getTotalSalesForYear(String year, Queue<String> gamesList){
        double numberOfSales = 0;


        for(String jsonString : gamesList){

            VideoGameRecord videoGameRecord = getRecordfromJSON(jsonString);

            if(year.equalsIgnoreCase(videoGameRecord.getYear())){
                numberOfSales += videoGameRecord.getNaSale() +
                        videoGameRecord.getEuSale() +
                        videoGameRecord.getNaSale() +
                        videoGameRecord.getOtherSales();
            }

        }

        return numberOfSales;
    }


    /**
     * takes the whole queue of game records
     * for each ear produces the total sale
     * for one particular game.
     * @param name
     * @param year
     * @param gamesList
     * @return
     */
    private double getNumberofSalesOfTitleForYear(String name, String year,  Queue<String> gamesList){
        double numberOfSales = 0;


        for(String jsonString : gamesList){

            VideoGameRecord videoGameRecord = getRecordfromJSON(jsonString);

            if(year.equalsIgnoreCase(videoGameRecord.getYear())&&  name.equalsIgnoreCase(videoGameRecord.getName())){
                numberOfSales += videoGameRecord.getNaSale() +
                        videoGameRecord.getEuSale() +
                        videoGameRecord.getNaSale() +
                        videoGameRecord.getOtherSales();
            }

        }


        return numberOfSales;
    }
}
