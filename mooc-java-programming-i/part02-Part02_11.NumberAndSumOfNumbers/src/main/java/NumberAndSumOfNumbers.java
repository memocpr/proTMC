
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count=0;
        int count2=0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num==0){
                System.out.println("Number of numbers: "+count2);
                System.out.println("Sum of the numbers: "+count);
                break;
            }


            count+=num;
            count2++;


        }
    }
}
