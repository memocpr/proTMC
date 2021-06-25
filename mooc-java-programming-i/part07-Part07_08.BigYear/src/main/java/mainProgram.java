
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        ArrayList<Bird> birds=new ArrayList<>();

        while (true){
            System.out.println("?");
            String str=scan.nextLine();

            if (str.equals("Quit")){
                break;
            }
            if (str.equals("Add")){
                System.out.print("Name: ");
                String name=scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName=scan.nextLine();
                Bird bird=new Bird(name,latinName);
                birds.add(bird);
            }else if(str.equals("All")){
                for (Bird oneBird: birds){
                    System.out.println(oneBird.toString());
                }
            }else if (str.equals("One")){
                System.out.println("Bird?");
                str=scan.nextLine();
                for (Bird oneBird: birds){
                    if (oneBird.getName().equals(str))
                    System.out.println(oneBird.toString());
                }
            }else if (str.equals("Observation")){
                System.out.println("Bird?");
                str=scan.nextLine();
                for (Bird oneBird: birds){
                    if (oneBird.getName().equals(str))
                        oneBird.observation();
                }
            }
        }

        System.out.println(birds.size());
    }

}
