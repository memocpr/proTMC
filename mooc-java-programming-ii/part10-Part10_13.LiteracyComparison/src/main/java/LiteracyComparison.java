
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
            .map(row -> row.split(","))
            .map(parts -> new Person(parts[3], Integer.valueOf(parts[4]), cut(parts[2]), Double.valueOf(parts[5])))
            .forEach(persons -> people.add(persons));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        people.stream().sorted(Comparator.comparing(Person::getRate)).forEach(persons -> System.out.println(persons));
    }

    public static String cut(String str){
        String[] arr=str.trim().split(" ");
        return arr[0];
    }
}
