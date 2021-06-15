import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jm, Scanner sc){
        this.jokes=jm;
        this.scanner=sc;
    }

    public void start(){

        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokes.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(jokes.drawJoke());


            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                jokes.printJokes();
            }
        }

    }
}
