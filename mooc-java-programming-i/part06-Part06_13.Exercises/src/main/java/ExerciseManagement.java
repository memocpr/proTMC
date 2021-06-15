import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement(){
        this.exercises=new ArrayList<>();

    }

    public ArrayList<String> exerciseList(){
        ArrayList<String> list=new ArrayList<>();
        for (Exercise ex:exercises){
            list.add(ex.getName());
        }
        return list;
    }

    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String str){
        for (Exercise ex: exercises){
            if (ex.getName().equals(str)){
                ex.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String str){
        for (Exercise ex: exercises){
            if (ex.getName().equals(str)){
                return ex.isCompleted();
            }
        }
        return false;
    }
}
