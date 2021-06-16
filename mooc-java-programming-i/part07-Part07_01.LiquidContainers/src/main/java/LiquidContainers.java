
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first=0;
        int second=0;

        while (true) {
            System.out.println("First: "+first+"/100");
            System.out.println("Second: "+second+"/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] arr=input.split(" ");

            String command=arr[0];
            int amount=Integer.valueOf(arr[1]);

            if(amount>=0){
                if(command.equals("add")){
                    if (first+amount<=100){
                        first+=amount;
                    }else{
                        first=100;
                    }
                }else if (command.equals("move")) {
                    if(first-amount>=0){
                        if(second+amount<=100){
                            second+=amount;
                        }else {
                            second=100;
                        }
                        first-=amount;
                    }else {
                        if(second+first<=100){
                            second+=first;
                        }else {
                            second=100;
                        }
                        first=0;
                    }

                }else if (command.equals("remove")) {
                    if(second-amount>=0 && amount>=0){
                        second-=amount;
                    }else {
                        second=0;
                    }
                }
            }
        }
    }
}
