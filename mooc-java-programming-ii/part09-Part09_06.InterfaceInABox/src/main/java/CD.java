public class CD implements Packable {

    private String artistName;
    private String cdName;
    private int publishedYear;
    private double cdWeight;

    public CD(String artistName, String cdName, int publishedYear) {
        this.artistName = artistName;
        this.cdName = cdName;
        this.publishedYear = publishedYear;
        this.cdWeight = 0.1;
    }

    @Override
    public double weight() {
        return cdWeight;
    }

    @Override
    public String toString() {
        return artistName + ": "+ cdName +" ("+ publishedYear +")";
    }
}
