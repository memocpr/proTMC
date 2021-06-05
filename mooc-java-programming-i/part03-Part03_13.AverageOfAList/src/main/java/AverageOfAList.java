
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.println("Average: "+sumList(list));
    }

    public static double sumList(ArrayList<Integer> myList){

        int sum=0;
        int num=myList.size();

        for (Integer x:myList){
            sum+=x;
        }

        return ((sum*0.1)/(num*0.1));
    }
}
