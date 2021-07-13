import java.util.ArrayList;

public class ChangeHistory{

    private ArrayList<Double> inventories;

    public ChangeHistory(){
        this.inventories=new ArrayList<>();

    }

    public void add(double status){
        inventories.add(status);
    }

    public void clear(){
        inventories.clear();
    }

    @Override
    public String toString() {
        return inventories.toString();
    }

    public double maxValue(){
        if (inventories.isEmpty()){
            return 0.0;
        }

        double max=inventories.get(0);

        for (Double status:inventories){
            if (status>=max){
                max=status;
            }
        }
        return max;
    }

    public double minValue(){
        if (inventories.isEmpty()){
            return 0.0;
        }

        double min=inventories.get(0);

        for (Double status:inventories){
            if (status<=min){
                min=status;
            }
        }

        return min;
    }

    public double average(){
        if (inventories.isEmpty()){
            return 0.0;
        }
        double sum=0.0;

        for (Double status:inventories){
                sum+=status;
        }
        return sum/inventories.size();
    }


}
