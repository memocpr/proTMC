import java.util.Scanner;

public class Bird {

    private String name;
    private String latinName;
    private int observation;

    public Bird(String nm, String lNm){

        this.name=nm;
        this.latinName=lNm;

    }

    public String getName(){
        return name;
    }

    public void observation(){
        observation++;
    }

    public int getObservation(){
        return observation;
    }

    public String toString(){
        return name+" ("+latinName+"): "+observation+" observations";
    }



}
