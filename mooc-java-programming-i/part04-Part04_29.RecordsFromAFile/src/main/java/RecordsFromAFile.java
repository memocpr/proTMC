
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file=scanner.nextLine();

        try(Scanner sc=new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()){
                String[] parts=sc.nextLine().split(",");

                String name=parts[0];
                String year="year";
                int age=Integer.valueOf(parts[1]);

                if (age>1 || age<1){
                    year+="s";
                }

                System.out.println(name+", age: "+age+" "+year);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
