
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str="yes";

        /*while (!str.equals("no")){
            System.out.println("Shall we carry on?");
            str=scanner.nextLine();
        }*/

        while (true){

            System.out.println("Shall we carry on?");
            str=scanner.nextLine();
            if(str.equals("no")){
                break;
            }
        }


    }
}
