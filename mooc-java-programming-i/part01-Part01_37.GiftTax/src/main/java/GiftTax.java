
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");

        double doub=Double.valueOf(scan.nextLine());

        if (doub<5000){
            System.out.println("No tax!");
        }else if (doub>=5000 && doub<25000){
            System.out.println("Tax: "+(100+(doub-5000)*0.08));
        }else if (doub>=25000 && doub<55000){
            System.out.println("Tax: "+(1700+(doub-25000)*0.1));
        }else if (doub>=55000 && doub<200000){
            System.out.println("Tax: "+(4700+(doub-55000)*0.12));
        }else if (doub>=200000 && doub<1000000){
            System.out.println("Tax: "+(22100+(doub-200000)*0.15));
        }else{
            System.out.println("Tax: "+(142100+(doub-1000000)*0.17));
        }

    }
}
