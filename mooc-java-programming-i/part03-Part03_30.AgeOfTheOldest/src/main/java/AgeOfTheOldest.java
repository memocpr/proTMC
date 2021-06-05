
import java.sql.Array;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str="";

        int biggestAge=0;
        String biggestName="";


        while (true){

            str=scanner.nextLine();

            if (str.equals("")){
                break;
            }

            String[] splitStr=str.split(",");

            if (Integer.valueOf(splitStr[1])>=biggestAge){

                biggestAge=Integer.valueOf(splitStr[1]);

            }
        }

        System.out.println("Age of the oldest: "+biggestAge);


    }
}
