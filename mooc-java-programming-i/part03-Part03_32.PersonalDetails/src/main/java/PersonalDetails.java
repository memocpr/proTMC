
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str="";



        int sumOfDate=0;
        int longest=0;
        String longestName="";
        int count=0;


        while (true){

            str=scanner.nextLine();

            if (str.equals("")){
                break;
            }

            String[] splitStr=str.split(",");

            if (Integer.valueOf(splitStr[0].length())>longest){
                longest=Integer.valueOf(splitStr[0].length());
                longestName=splitStr[0];
            }

            count++;
            sumOfDate+=Integer.valueOf(splitStr[1]);
        }

        System.out.println("Longest name: "+longestName);

        System.out.println("Average of birth years: "+((sumOfDate*1.0)/count));


    }
}
