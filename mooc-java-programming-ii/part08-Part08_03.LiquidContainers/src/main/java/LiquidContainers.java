
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstAmount=0;
        int secondAmount=0;


        while (true) {

            System.out.println("First:"+firstAmount+"/100");
            System.out.println("Second:"+secondAmount+"/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts=input.split(" ");

            String command=parts[0];
            int amount=Integer.valueOf(parts[1]);

            if (command.equals("add") && amount>=0){

                int total=(firstAmount+amount<=100) ? (firstAmount+=amount):(firstAmount=100);

            }
            if (command.equals("move") && amount>=0){

                if(firstAmount-amount>=0){
                    firstAmount-=amount;

                    if(secondAmount+amount<=100){
                        secondAmount+=amount;
                    }else {
                        secondAmount=100;
                    }
                }else {

                    if(secondAmount+firstAmount<=100){
                        secondAmount+=firstAmount;
                        firstAmount=0;
                    }else {
                        secondAmount=100;
                        firstAmount=0;
                    }
                }

            }

            if (command.equals("remove") && amount>=0){

                if (secondAmount-amount>=0){
                    secondAmount-=amount;
                }else {
                    secondAmount=0;
                }

            }

        }
    }

}
