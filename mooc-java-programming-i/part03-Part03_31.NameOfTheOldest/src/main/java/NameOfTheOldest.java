
import java.util.Scanner;

public class NameOfTheOldest {

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
                biggestName=splitStr[0];
            }
        }

        System.out.println("Name of the oldest: "+biggestName);

    }
}
