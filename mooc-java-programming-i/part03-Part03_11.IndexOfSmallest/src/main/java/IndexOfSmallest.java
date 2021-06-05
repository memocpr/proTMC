
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        /*int smallest=list.get(0);

        for (int i=0; i<list.size(); i++){
            if (list.get(i)<=smallest){
                smallest=list.get(i);
            }
        }

        System.out.println("Smallest number: "+smallest);*/





        /*int input1 = smallest;

        for (int i=0; i<list.size(); i++){
            if(list.get(i)==input1){
                System.out.println("Found at index: "+i);
            }
        }*/
        System.out.println("Smallest number: "+getSmallest(list));
        getIndexS(list, getSmallest(list));
    }



    public static int getSmallest(ArrayList<Integer> list){

        int smallest=list.get(0);

        for (int i=0; i<list.size(); i++){
            if (list.get(i)<=smallest){
                smallest=list.get(i);
            }
        }
        return smallest;
    }

    public static void getIndexS(ArrayList<Integer> list, int x){
        for (int i=0; i<list.size(); i++){
            if(list.get(i)==x){
                System.out.println("Found at index: "+i);
            }
        }
    }

}
