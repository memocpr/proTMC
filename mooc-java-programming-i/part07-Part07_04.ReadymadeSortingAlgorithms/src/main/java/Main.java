import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] arr={"c","a","b"};
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);


        sort(array);
        sort(arr);
        sortIntegers(arrayList);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayList);

    }


    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void sort(String[] arr){
        Arrays.sort(arr);
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);

    }

    public static void sortStrings(ArrayList<String> strings){

        Collections.sort(strings);
    }

}
