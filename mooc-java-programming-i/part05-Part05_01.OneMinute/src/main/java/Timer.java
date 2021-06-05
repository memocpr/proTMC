public class Timer {
    private ClockHand hundth;
    private ClockHand second;

    public Timer(){
        this.hundth = new ClockHand(100);
        this.second = new ClockHand(60);
    }

    public void advance() {
        this.hundth.advance();

        if (this.hundth.value()==0) {
            this.second.advance();
        }
    }

    public String toString() {
        return second+":"+hundth;
    }
}
