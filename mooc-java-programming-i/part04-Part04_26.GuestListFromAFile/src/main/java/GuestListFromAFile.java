
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        // implement reading the file here.
        System.out.println("");

        try(Scanner sc=new Scanner(Paths.get(file))) {
            System.out.println("Enter names, an empty line quits.");
            while (sc.hasNextLine()){
                String oneName=sc.nextLine();
                list.add(oneName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
        System.out.println("Thank you!");
    }
}
