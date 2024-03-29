import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {

    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients=ingredients;

    }

    public void add(String str){
        ingredients.add(str);
    }

    public String toString(){
       return name+", cooking time: "+time;
    }

    public String getName(){
        return name;
    }

    public int getTime(){
        return time;
    }

    public ArrayList<String> getIngredients(){
        return ingredients;
    }
}
