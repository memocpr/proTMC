public class Student extends Person {

    private int credit;


    public Student(String nm, String add) {
        super(nm, add);
        this.credit=0;
    }

    public void study(){
        credit++;
    }

    public int credits(){
        return credit;
    }

    public String toString(){
        return super.toString()+"\n  Study credits "+credit;
    }
}
