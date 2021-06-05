public class Cube {
    private int edge;
    private int volume;

    public Cube(int edgeLength){
        this.edge=edgeLength;
        this.volume=volume();
    }

    public int volume(){
        this.volume=(this.edge*this.edge*this.edge);
        return this.volume;
    }

    public String toString(){
        String str= "The length of the edge is "+edge+" and the volume "+volume;
        return str;
    }
}
