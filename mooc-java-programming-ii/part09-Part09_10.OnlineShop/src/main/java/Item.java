import java.util.HashMap;
import java.util.Map;

public class Item {

    private String itemName;
    private int itemQuantity;
    private int itemUnitPrice;


    public Item(String product, int qty, int unitPrice){
        this.itemName=product;
        this.itemQuantity=qty;
        this.itemUnitPrice=unitPrice;
    }

    public int price(){
        return itemUnitPrice*itemQuantity;
    }

    public void increaseQuantity(){
        itemQuantity++;
    }

    @Override
    public String toString() {
        return itemName+": " + itemQuantity;
    }
}
