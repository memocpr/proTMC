import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> items;
    private double maxCapacity;

    public Box(double capacity){
        this.items=new ArrayList<>();
        this.maxCapacity=capacity;
    }

    @Override
    public double weight() {
        double totalWeight=0;

        for (Packable onePackable:items){
            totalWeight+=onePackable.weight();
        }
        return totalWeight;
    }


    public void add(Packable packable){

        if (weight()+packable.weight()<=maxCapacity){
            items.add(packable);
        }
    }

    @Override
    public String toString() {
        return "Box: " + items.size()+ " items, total weight " + weight() + " kg";
    }
}
