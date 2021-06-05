
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int num0=Integer.valueOf(scanner.nextLine());

        System.out.println("Last number?");
        int num=Integer.valueOf(scanner.nextLine());

        int total=0;

        for (int i=num0; i<=num; i++){
            total+=i;
        }

        System.out.println(total);

    }
}
