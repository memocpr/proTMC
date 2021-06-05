
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list=new ArrayList<>();

        String str;
        int count=0;

        while (true){
            str=scanner.nextLine();

            if (str.equals("end")){
                System.out.println(count);
                break;
            }

            list.add(str);
            count++;
        }

    }
}
