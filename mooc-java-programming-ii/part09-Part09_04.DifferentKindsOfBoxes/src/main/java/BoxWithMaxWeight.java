import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxCapacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        this.maxCapacity=capacity;
        this.items=new ArrayList<>();
    }


    @Override
    public void add(Item item) {

        int sum=0;

        for (Item oneItem: items){
            sum+=oneItem.getWeight();
        }

        if(!isInBox(item) && sum+item.getWeight()<=maxCapacity){
            items.add(item);
            super.add(items);
        }

    }

    @Override
    public boolean isInBox(Item item) {

        if (items.contains(item)){
            return true;
        }else {
            return false;
        }
    }
}
