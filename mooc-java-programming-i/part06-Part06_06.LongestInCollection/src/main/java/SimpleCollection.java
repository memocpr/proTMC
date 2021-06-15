
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest(){
        String str;

        if (elements.isEmpty()){
            return null;
        }
            str=elements.get(0);
            for (String s:elements){
                if (s.length()>=str.length()){
                    str=s;
                }
            }


        return str;
    }

}
