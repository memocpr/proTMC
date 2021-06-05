
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String str=scanner.nextLine();

        try(Scanner sc=new Scanner(Paths.get(str))) {
            while (sc.hasNextLine()){
                str=sc.nextLine();
                System.out.println(str);
            }
        }catch (Exception e){
                System.out.println("Error: "+e.getMessage());
        }
    }
}
