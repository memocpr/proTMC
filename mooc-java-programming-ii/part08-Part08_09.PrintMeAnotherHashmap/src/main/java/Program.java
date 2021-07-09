
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!

        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValues(HashMap<String, Book> hashMap){

        for (Book oneBook: hashMap.values()){
            System.out.println(oneBook);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text){

        for (String str: hashMap.keySet()){
            if (hashMap.get(str).getName().contains(text)){
                System.out.println(hashMap.get(str));
            }
        }
    }

}
