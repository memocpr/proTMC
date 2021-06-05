
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        String input2 = scanner.nextLine();
        founded(list, input2);
    }

    public static void founded(ArrayList<String> myList, String str){



        if (myList.contains(str)){
            System.out.println(str+" was found!");
        }else {
            System.out.println(str+" was not found!");
        }
    }
}
