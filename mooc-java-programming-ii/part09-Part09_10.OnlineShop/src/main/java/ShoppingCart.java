import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> itemsInCart;

    public ShoppingCart(){
        this.itemsInCart =new HashMap<>();
    }

    public void add(String product, int price){

        if(!(itemsInCart.containsKey(product))){
            Item item=new Item(product, 1, price);
            itemsInCart.put(product,item);
        }else {
            itemsInCart.get(product).increaseQuantity();
        }
    }

    public int price(){
        int totalPrice=0;

        for (Item item:itemsInCart.values()){
            if(item.price()>=0){
                totalPrice+=item.price();
            }
        }
        return totalPrice;
    }

    public void print(){
        for (Item item:itemsInCart.values()){
            System.out.println(item.toString());
        }
    }

}
