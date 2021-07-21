public class Person{

    private String country;
    private int year;
    private String gender;
    private double rate;

    public Person(String country, int year, String gender, double rate){
        this.country=country;
        this.year=year;
        this.gender=gender;
        this.rate=rate;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return this.country +" (" + this.year + "), " + this.gender + ", " + this.rate ;
    }

}
