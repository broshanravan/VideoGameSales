import bl.VideoGameRecord;
import bl.VideoGamesRecordConsumer;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Queue;

public class VideoGamesRecordConsumerTst {

    static Queue videoGameRecordList = new LinkedList<String>();

    /**
     * Preparing the neded atributes
     * for the Test
     */
    @BeforeClass
    public static void Setup() {


        String videoGameJSON =
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



        videoGameRecordList.add(videoGameJSON);
    }

    @Test
    public void getTotalSalesForYearTst(){
        VideoGamesRecordConsumer videoGamesRecordConsumer = new VideoGamesRecordConsumer();
            double  totalSales = videoGamesRecordConsumer.getTotalSalesForYear("2006",videoGameRecordList);

            assert(totalSales == 165.48);

    }
}
