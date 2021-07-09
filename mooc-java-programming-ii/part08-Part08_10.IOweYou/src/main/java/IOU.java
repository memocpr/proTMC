import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> iou;

    public IOU(){
        this.iou=new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        iou.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        for (String str: iou.keySet()){
            if(str.equals(toWhom)){
                return iou.get(str);
            }
        }
        return 0;
    }
}
