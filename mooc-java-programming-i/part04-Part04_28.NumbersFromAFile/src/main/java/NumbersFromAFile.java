
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count=0;

        try (Scanner sc=new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()){
                int num=Integer.valueOf(sc.nextLine());
                if (num<=upperBound && num>=lowerBound){
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Numbers: "+count);


    }

}
