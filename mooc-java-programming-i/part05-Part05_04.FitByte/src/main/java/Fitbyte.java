public class Fitbyte {
    private int yourAge;
    private int restRate;

    public Fitbyte(int age, int restHeartRate){
        this.yourAge=age;
        this.restRate=restHeartRate;
    }

    public double targetHeartRate(double perOfMax){
        double maxRate=206.3-(0.71*yourAge);
        return (maxRate-restRate)*perOfMax+restRate;
    }
}
