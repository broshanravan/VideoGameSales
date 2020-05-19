package bl;

import dl.VideoGameCSVReader;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import com.google.gson.Gson;

public class VideoGameQueLoader {

    VideoGameCSVReader videoGameCSVReader;


    public VideoGameCSVReader getVideoGameCSVReader() {
        return videoGameCSVReader;
    }

    public void setVideoGameCSVReader(VideoGameCSVReader videoGameCSVReader) {
        this.videoGameCSVReader = videoGameCSVReader;
    }

    public Queue getVideoGamesJASONQueue(String csvFileNamePath) {

        Queue videoGamesQueue = new LinkedList<String>();

        List<VideoGameRecord> videoGamesList = videoGameCSVReader.getVideoGamesListFromCsv(csvFileNamePath);

        Gson gson = new Gson();

        for (VideoGameRecord videoGameRecord : videoGamesList){

            String videoGameRecordJSON = gson.toJson(videoGameRecord);


            videoGamesQueue.add(videoGameRecordJSON);
        }


        return videoGamesQueue;
    }
}
