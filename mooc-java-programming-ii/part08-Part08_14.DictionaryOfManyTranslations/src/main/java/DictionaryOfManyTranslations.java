import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> listHashMap;


    public DictionaryOfManyTranslations(){
        this.listHashMap=new HashMap<>();
    }


    public void add(String word, String translation){

        this.listHashMap.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> translateList=this.listHashMap.get(word);

        translateList.add(translation);

        //this.listHashMap.get(word).add(translation);
    }


    public ArrayList<String> translate(String word){

        ArrayList<String> arrList=new ArrayList<>();

        if (listHashMap.containsKey(word)){
            return this.listHashMap.get(word);
        }

        return arrList;

    }

    public void remove(String word){

        if (listHashMap.containsKey(word)){
            this.listHashMap.get(word).clear();
        }
    }

}
