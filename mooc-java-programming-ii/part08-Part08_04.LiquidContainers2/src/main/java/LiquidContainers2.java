
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();


        while (true) {

            System.out.println("First: "+container1);
            System.out.println("Second: "+container2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts=input.split(" ");
            String command=parts[0];
            int liquid=Integer.valueOf(parts[1]);

            if (command.equals("add")){
                container1.add(liquid);
            }

            if (command.equals("remove")){
                container2.remove(liquid);
            }

            if (command.equals("move")){

                int liquid1=container1.contains();

                container1.remove(liquid);

                if (liquid1>=liquid){
                    container2.add(liquid);
                }else {
                    container2.add(liquid1);
                }

            }


        }




    }

}
