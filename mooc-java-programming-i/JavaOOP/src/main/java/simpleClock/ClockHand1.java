package simpleClock;

public class ClockHand1 {

    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        while(true) {
            // 1. printing the time
            print(hours, minutes, seconds);
            System.out.println();

            // 2. advancing the second hand
            seconds = seconds + 1;

            // 3. advancing the other hands when necessary
            if (seconds > 59) {
                minutes = minutes + 1;
                seconds = 0;

                if (minutes > 59) {
                    hours = hours + 1;
                    minutes = 0;

                    if (hours > 23) {
                        hours = 0;
                    }
                }
            }
        }
    }

    public static void print(int hours, int minutes, int seconds) {
        print(hours);
        print(minutes);
        print(seconds);
    }

    public static void print(int value) {
        if (value < 10) {
            System.out.print("0");
            System.out.print(value+" : ");
        }
    }
}

