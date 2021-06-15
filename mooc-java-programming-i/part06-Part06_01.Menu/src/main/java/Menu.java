
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {

        this.meals = new ArrayList<>();
    }

    // implement the required methods here

    public void addMeal(String meal){

        if(!meals.contains(meal)){
            meals.add(meal);
        }


    }

    public void printMeals(){
        for (String oneMeal:meals){
            System.out.println(oneMeal);
        }
    }

    public void clearMenu(){
        int size=meals.size();
        while (size>0){
            meals.remove(0);
            size--;
        }
    }
}
