
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.\n" +
                "What is the main character called?");

        String answer1=scanner.nextLine();

        System.out.println("What is their job?");

        String answer2=scanner.nextLine();

        System.out.println("Here is the story:\n" +
                "Once upon a time there was "+answer1+", who was "+answer2+".\n" +
                "On the way to work, "+answer1+" reflected on life.\n" +
                "Perhaps "+answer1+" will not be "+answer2+" forever.");

    }
}
