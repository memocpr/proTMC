import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> list;

    public JokeManager(){
        this.list=new ArrayList<>();
    }

    public void addJoke(String joke){
        list.add(joke);
    }

    public String drawJoke(){
        if (list.size()==0){
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(list.size());
        return list.get(index);
    }

    public void printJokes(){
        for (String str:list){
            System.out.println(str);
        }
    }
}
