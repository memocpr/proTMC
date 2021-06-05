
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");

        String doubX=scanner.nextLine();

        double x=Double.valueOf(doubX);

        System.out.println("You gave the number "+x);

    }
}
