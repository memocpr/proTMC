
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count=0;
        int count2=0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num==0){

                if (count==0){
                    System.out.println("Cannot calculate the average");
                    break;
                }else {
                    System.out.println("Average of the numbers: "+(count*1.0/count2*1.0));
                    break;

                }


            }


            if (num>0) {
                count += num;
                count2++;
            }


        }

    }
}
