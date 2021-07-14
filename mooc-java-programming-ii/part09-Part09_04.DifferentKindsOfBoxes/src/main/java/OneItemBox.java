import java.util.ArrayList;

public class OneItemBox extends Box{

    private ArrayList<Item> oneItemList;

    public OneItemBox(){
        this.oneItemList=new ArrayList<>();
    }


    @Override
    public void add(Item item) {
        if (oneItemList.isEmpty()){
            oneItemList.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return oneItemList.contains(item);
    }
}
