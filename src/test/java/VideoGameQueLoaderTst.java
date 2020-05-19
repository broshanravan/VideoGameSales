import bl.VideoGameQueLoader;
import bl.VideoGameRecord;
import dl.VideoGameCSVReader;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.mockito.Mockito.when;

public class VideoGameQueLoaderTst {


    static VideoGameCSVReader csvReader = null;
    @BeforeClass
    public static void Setup(){
        List<VideoGameRecord> videoGameRecordList = new LinkedList<VideoGameRecord>();

        VideoGameRecord videoGameRecord1 = new VideoGameRecord(
                                                            1,
                                                            "Wii",
                                                            "Sports",
                                                            "2006",
                                                            "Sports",
                                                            "Nintendo",
                                                            41.49,
                                                            29.02,
                                                            3.77,
                                                            8.46,
                                                            82.74);

        VideoGameRecord videoGameRecord2 = new VideoGameRecord(
                                                            2,
                                                            "Super Mario Bros.",
                                                            "NES",
                                                            "1985",
                                                            "Platform",
                                                            "Nintendo",
                                                            29.08,
                                                            3.58,
                                                            6.81,
                                                            0.77,
                                                            40.24
        );


        videoGameRecordList.add(videoGameRecord1);
        videoGameRecordList.add(videoGameRecord2);

        csvReader = Mockito.mock(VideoGameCSVReader.class);
        when(csvReader.getVideoGamesListFromCsv("filepath")).thenReturn(videoGameRecordList);

    }

    @Test
    public void testGetVideoGamesJASONQueue(){
        VideoGameQueLoader videoGameQueLoader = new VideoGameQueLoader();
        videoGameQueLoader.setVideoGameCSVReader(csvReader);

         Queue jsonQueue = videoGameQueLoader.getVideoGamesJASONQueue("filepath");
         assert(jsonQueue.size() == 2 );
         String expectedResults =
                 "{\"rank\":1," +
                 "\"name\":\"Wii\"," +
                 "\"year\":\"2006\"," +
                 "\"platform\":\"Sports\"," +
                 "\"Game\":\"Sports\"," +
                 "\"publisher\":\"Nintendo\"," +
                 "\"NA_Sale\":41.49," +
                 "\"EU_Sales\":29.02," +
                 "\"JP_Sales\":3.77," +
                 "\"Other_Sales\":8.46," +
                 "\"globale_Sales\":82.74}";

        String record1Json = (String)jsonQueue.element();
         assert(record1Json.equalsIgnoreCase(expectedResults));

    }
}
