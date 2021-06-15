public class Item {

    private String name;
    private int weight;

    public Item(String itemName, int itemWeight) {
        this.name=itemName;
        this.weight=itemWeight;
    }


    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public String toString(){
        return name+" ("+weight+" kg)";
    }
}
