
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isOk=true;

        while (isOk){
            System.out.println("Give a number:");
            int num=Integer.valueOf(scanner.nextLine());

            if (num==4){
                isOk=false;
            }

        }

        System.out.println("end");
    }
}
