import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        changeHistory=new ChangeHistory();
        changeHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);

    }

    public String history(){
        return changeHistory.toString();
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());

    }

    public double takeFromWarehouse(double amount){
        changeHistory.add(super.getBalance()-amount);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis(){

        System.out.println("Product: "+super.getName());
        System.out.println("History: "+history());
        System.out.println("Largest amount of product: "+changeHistory.maxValue());
        System.out.println("Smallest amount of product: "+changeHistory.minValue());
        System.out.println("Average: "+changeHistory.average());
    }
}
