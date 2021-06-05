
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user1="alex";
        String pass1="sunshine";
        String user2="emma";
        String pass2="haskell";

        System.out.println("Enter username:");
        String input1=scanner.nextLine();

        System.out.println("Enter password:");
        String input2=scanner.nextLine();

        if ((input1.equals(user1) && input2.equals(pass1)) || ((input1.equals(user2))&& (input2.equals(pass2)))){
            System.out.println("You have successfully logged in!");
        }else {
            System.out.println("Incorrect username or password!");
        }

    }
}
