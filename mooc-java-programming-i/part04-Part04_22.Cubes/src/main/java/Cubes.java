
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;
        int x;

        while (true){

            str=scanner.nextLine();
            if (str.equals("end")){
                break;
            }

            x=Integer.valueOf(str);
            System.out.println(x*x*x);
        }

    }
}
