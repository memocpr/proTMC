
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        while (true){
            name=scanner.nextLine();
            if(name.equals("")){
                break;
            }
            Item oneObj=new Item(name);
            items.add(oneObj);
        }

        for(Object obj:items){
            System.out.println(obj);
        }

    }
}
