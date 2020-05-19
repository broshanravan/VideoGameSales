package bl;

public class VideoGameRecord {

    private int rank;
    private String name;
    private String year;
    private String platform;
    private String Game;
    private String publisher;
    private double NA_Sale;
    private double EU_Sales;
    private double JP_Sales;
    private double Other_Sales;
    private double Globale_Sales;

    public VideoGameRecord(int rank, String name, String platform, String year, String game, String publisher, double NA_Sale, double EU_Sales, double JP_Sales,
                           double Other_Sales, double Globale_Sales) {
        this.rank = rank;
        this.name = name;
        this.year = year;
        this.platform = platform;
        Game = game;
        this.publisher = publisher;
        this.NA_Sale = NA_Sale;
        this.EU_Sales = EU_Sales;
        this.JP_Sales = JP_Sales;
        this.Other_Sales = Other_Sales;
        this.Globale_Sales = Globale_Sales;
    }

    public double getGlobale_Sales() {
        return Globale_Sales;
    }

    public void setGlobale_Sales(double globale_Sales) {
        this.Globale_Sales = globale_Sales;
    }

    private double getTotalSales(){
        double totalSale = NA_Sale + EU_Sales + JP_Sales + Other_Sales;

        return totalSale;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getNA_Sale() {
        return NA_Sale;
    }

    public void setNA_Sale(double NA_Sale) {
        this.NA_Sale = NA_Sale;
    }

    public double getEU_Sales() {
        return EU_Sales;
    }

    public void setEU_Sales(double EU_Sales) {
        this.EU_Sales = EU_Sales;
    }

    public double getJP_Sales() {
        return JP_Sales;
    }

    public void setJP_Sales(double JP_Sales) {
        this.JP_Sales = JP_Sales;
    }

    public double getOther_Sales() {
        return Other_Sales;
    }

    public void setOther_Sales(double other_Sales) {
        this.Other_Sales = other_Sales;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getGame() {
        return Game;
    }

    public void setGame(String game) {
        Game = game;
    }




}
