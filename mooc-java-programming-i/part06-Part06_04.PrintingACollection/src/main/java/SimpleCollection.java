
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

    public String toString(){
        String str="";
        String element="";

        for (String oneElement:elements){
            element=element+oneElement+"\n";
        }
        if(elements.isEmpty()){
            return "The collection "+name+" is empty.";
        }
        if(elements.size()==1){
            str="The collection "+name+" has "+elements.size()+" element:";
            element=elements.get(0);
        }else {
            str="The collection "+name+" has "+elements.size()+" elements:";
        }

        return str+"\n"+element;
    }
    
}
