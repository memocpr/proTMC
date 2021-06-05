
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str="";
        while (true){

            str=scanner.nextLine();

            if (str.equals("")){
                break;
            }

            String[] splitStr=str.split(" ");



            System.out.println(splitStr[0]);

        }

    }
}
