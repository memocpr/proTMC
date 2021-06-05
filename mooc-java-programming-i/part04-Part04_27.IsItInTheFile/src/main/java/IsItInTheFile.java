
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        boolean isThere=true;

        try(Scanner sc=new Scanner(Paths.get(file))) {

            while (sc.hasNextLine()){
                String oneName=sc.nextLine();
                list.add(oneName);
            }
        } catch (IOException e) {
            isThere=false;
        }

        System.out.println("Search for:");
        String name = scanner.nextLine();
        if (!isThere) {
            System.out.println("Reading the file "+file+" failed");
        }else if (list.contains(name)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }
    }
}
