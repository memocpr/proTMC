package sortMethod;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] arr) {

        // smallest and indexOfSmallest
        for (int y=0; y<arr.length; y++){
            int smallest=arr[y];
            int indexS=y;
            //smallestFrom and indexOfSmallest
            for (int i=y; i<arr.length; i++){
                if (arr[i]<=smallest){
                    smallest=arr[i];
                    indexS=i;
                }
            }

            // swap
            int a=arr[y];
            int b=arr[indexS];
            int helper=a;

            arr[y]=b;
            arr[indexS]=helper;
        }
    }
}
