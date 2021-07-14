import java.util.ArrayList;

public class MisplacingBox extends Box{

    ArrayList<Item> misItems;

    public MisplacingBox(){
        misItems=new ArrayList<>();
    }


    @Override
    public void add(Item item) {

        misItems.add(item);

    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
