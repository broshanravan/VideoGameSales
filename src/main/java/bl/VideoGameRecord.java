package bl;

public class VideoGameRecord {

    private int rank;
    private String name;
    private String year;
    private String platform;
    private String Game;
    private String publisher;
    private double naSale;
    private double euSale;
    private double jpSale;
    private double otherSales;
    private double gloableSales;

    public VideoGameRecord(int rank, String name, String platform, String year,  String game, String publisher, double naSale, double euSale, double jpSale,
                           double otherSales,double gloableSales) {
        this.rank = rank;
        this.name = name;
        this.year = year;
        this.platform = platform;
        Game = game;
        this.publisher = publisher;
        this.naSale = naSale;
        this.euSale = euSale;
        this.jpSale = jpSale;
        this.otherSales = otherSales;
        thisgloableSales = gloableSales
    }

    private double getTotalSales(){
        double totalSale = naSale + euSale + jpSale + otherSales;

        return totalSale;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getNaSale() {
        return naSale;
    }

    public void setNaSale(double naSale) {
        this.naSale = naSale;
    }

    public double getEuSale() {
        return euSale;
    }

    public void setEuSale(double euSale) {
        this.euSale = euSale;
    }

    public double getJpSale() {
        return jpSale;
    }

    public void setJpSale(double jpSale) {
        this.jpSale = jpSale;
    }

    public double getOtherSales() {
        return otherSales;
    }

    public void setOtherSales(double otherSales) {
        this.otherSales = otherSales;
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
