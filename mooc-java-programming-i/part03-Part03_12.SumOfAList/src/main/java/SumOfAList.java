
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

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

        System.out.println("Sum: "+sumList(list));
    }

    public static int sumList(ArrayList<Integer> myList){

        int sum=0;

        for (Integer x:myList){
            sum+=x;
        }

        return sum;
    }
}
