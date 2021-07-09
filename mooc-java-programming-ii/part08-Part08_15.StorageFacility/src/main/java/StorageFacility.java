import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    HashMap<String,ArrayList<String>> track;

    public StorageFacility(){
        this.track=new HashMap<>();
    }

    public void add(String unit, String item){

        this.track.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> translateList=this.track.get(unit);
        translateList.add(item);
    }

    public ArrayList<String> contents(String storageUnit){

        if (track.containsKey(storageUnit)) {
            return track.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String unit, String item){
        if (track.containsKey(unit)) {
            ArrayList<String> translateList=this.track.get(unit);
            translateList.remove(item);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> unitList=new ArrayList<>();

        for (String str: track.keySet()){

            if (!(track.get(str).isEmpty())){
                unitList.add(str);
            }
        }
        return unitList;
    }

}
