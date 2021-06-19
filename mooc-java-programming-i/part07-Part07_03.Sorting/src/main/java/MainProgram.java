import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // indices:      0  1  2  3  4
        int[] numbers = {6,-1,4};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
    }


    public static int smallest(int[] arr){
        int smallest=arr[0];

        for (int x:arr){
            if (x<=smallest){
                smallest=x;
            }
        }
        return smallest;
    }


    public static int indexOfSmallest(int[] arr){
        int smallest=arr[0];
        int indexS=0;

        for (int i=0; i<arr.length; i++){

            if (arr[i]<=smallest){
                smallest=arr[i];
                indexS=i;
            }
        }
        return indexS;
    }

    public static int indexOfSmallestFrom(int[] arr, int startIndex) {
        int smallest=arr[startIndex];
        int indexSmallest=0;

        for (int i=startIndex; i<arr.length; i++){

            if (arr[i]<=smallest){
                smallest=arr[i];
                indexSmallest=i;
            }
        }
        return indexSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {

        int a=array[index1];
        int b=array[index2];
        int helper=a;

        array[index1]=b;
        array[index2]=helper;
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
