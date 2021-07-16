import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String,Integer> productsWithPrice;
    private Map<String,Integer> productsWithStock;

    public Warehouse(){
        this.productsWithPrice =new HashMap<>();
        this.productsWithStock =new HashMap<>();
    }


    // ??? ================================================
    public void addProduct(String pro, int pri, int sto){
        productsWithPrice.put(pro,pri);
        productsWithStock.put(pro,sto);
    }

    public int price(String product){
        if(productsWithPrice.containsKey(product)){
            return productsWithPrice.get(product);
        }
        return -99;
    }

    public int stock(String product){
        if(productsWithStock.containsKey(product)){
            return productsWithStock.get(product);
        }
        return 0;
    }

    public boolean take(String product){
        if (productsWithStock.containsKey(product)){
            int qty=productsWithStock.get(product);
            if (qty>0){
                qty--;
                productsWithStock.remove(product);
                productsWithStock.put(product,qty);
                return true;
            }
            return false;
        }
        return false;
    }



    public Set<String> products(){
        Set<String> itemNames=new HashSet<>();
        itemNames= productsWithStock.keySet();
        return itemNames;
    }



}
