
public class HealthStation {

    private int count;

    public int weigh(Person p) {
        // return the weight of the person passed as the parameter
        count++;
        return p.getWeight();
    }

    public void feed(Person p){
        p.setWeight(p.getWeight()+1);

    }

    public int weighings(){
        return count;
    }

}
