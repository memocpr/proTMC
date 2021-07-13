public class Person {

    private String name;
    private String adress;


    public Person(String nm, String add){
        this.name=nm;
        this.adress=add;
    }

    public String toString(){
        return name + "\n  "+adress;
    }
}
