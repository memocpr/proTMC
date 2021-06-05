
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) throws IOException {

        try(Scanner sc=new Scanner(Paths.get("data.txt"))) {
            while (sc.hasNextLine()){
                String str=sc.nextLine();
                System.out.println(str);
            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
