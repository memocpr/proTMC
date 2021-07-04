
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!

        HashMap<String,String> nickNames=new HashMap<>();

        nickNames.put("matthew","matt");
        nickNames.put("michael","mix");
        nickNames.put("arthur","artie");

        String name1=nickNames.get("matthew");
        System.out.println(name1);

        System.out.println(nickNames.get("michael"));
        System.out.println(nickNames.get("arthur"));
    }

}
