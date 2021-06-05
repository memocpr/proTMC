
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count=0;
        int count2=0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num==0){

                System.out.println("Average of the numbers: "+(count*1.0/count2*1.0));
                break;
            }


            count+=num;
            count2++;


        }

    }
}
