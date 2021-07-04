import java.lang.reflect.Array;
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDolist;

    public TodoList(){
        this.toDolist=new ArrayList<>();
    }

    public void add(String task){
        toDolist.add(task);
    }

    public void print(){
        for (String s:toDolist){
            System.out.println(toDolist.indexOf(s)+1+": "+s);
        }
    }

    public void remove(int taskIndex){
        toDolist.remove(taskIndex-1);
    }
}
