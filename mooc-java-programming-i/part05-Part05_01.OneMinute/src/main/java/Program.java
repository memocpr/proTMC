public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer timer=new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            System.out.println(timer);
            try {
                Thread.sleep(1);
            } catch (Exception e) {

            }
        }

    }
}
