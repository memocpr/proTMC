

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here

        founded(array, searching);
    }

    public static void founded(int[] arr, int x){
        int count=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==x){
                count++;
                System.out.println(x+" is at index "+i+".");
            }
        }

        if (count==0){
            System.out.println(x+" was not founded");
        }

    }

}
