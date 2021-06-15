public class Exercise {

    private String name;
    private boolean completed;


    public Exercise(String exName){
        this.name=exName;
        this.completed=false;
    }

    public String getName(){
        return this.name;
    }

    public void setCompleted(boolean comp){
        this.completed=comp;
    }

    public boolean isCompleted(){
        return this.completed;
    }
}
