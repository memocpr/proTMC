import java.util.ArrayList;

public class Hold {

    private int max;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxKg){
        this.max=maxKg;
        this.suitcases=new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        int totalKg=0;
        for (Suitcase oneSuitcase:suitcases){
            totalKg+=oneSuitcase.totalWeight();
        }
        if (totalKg+suitcase.totalWeight()<=max){
            suitcases.add(suitcase);
        }
    }

    public String toString(){
        int totalKg=0;
        for (Suitcase oneSuitcase:suitcases){
            totalKg+=oneSuitcase.totalWeight();
        }
        return suitcases.size()+" suitcases ("+totalKg+" kg)";
    }

    public void printItems(){
        for (Suitcase oneSuitcase:suitcases){
            oneSuitcase.printItems();
        }
    }
}
