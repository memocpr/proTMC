import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{

    private List<Movable> objects;

    public Herd(){
        this.objects=new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy) {

        for (Movable mvb:objects){
            mvb.move(dx,dy);
        }
    }

    public void addToHerd(Movable movable){
        objects.add(movable);
    }

    @Override
    public String toString() {

        String str="";
        for (Movable oneMovable:objects){
            str+=oneMovable.toString()+"\n";
        }
        return str;
    }
}
