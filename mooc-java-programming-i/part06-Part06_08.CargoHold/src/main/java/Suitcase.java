import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxLimit){
        this.items=new ArrayList<>();
        this.maxWeight=maxLimit;
    }

    public void addItem(Item item){
        int totalKg=0;
        for (Item i:items){
            totalKg+=i.getWeight();
        }

        if(totalKg+item.getWeight()<=maxWeight){
            items.add(item);
        }

    }

    public String toString(){
        String str=" items (";
        int totalKg=0;
        for (Item i:items){
            totalKg+=i.getWeight();
        }

        if(items.size()==0){
            return "no items (0 kg)";
        }else if(items.size()==1){
            str=" item (";
        }
        return items.size()+str+totalKg+" kg)";
    }

    public void printItems(){
        for (Item oneitem:items){
            System.out.println(oneitem);
        }
    }

    public int totalWeight(){
        int totalKg=0;
        for (Item i:items){
            totalKg+=i.getWeight();
        }

        return totalKg;
    }

    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heaviestOne=items.get(0);

        for (Item oneItem:items){
            if (oneItem.getWeight()>=heaviestOne.getWeight()){
                heaviestOne=oneItem;
            }
        }

        return heaviestOne;
    }



}
