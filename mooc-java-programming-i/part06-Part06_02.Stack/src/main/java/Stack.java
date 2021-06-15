import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stackList;

    public Stack(){
        this.stackList=new ArrayList<>();
    }

    public boolean isEmpty(){

        if (stackList.size() == 0) {
            return true;
        }
        return false;
    }

    public void add(String value){
        stackList.add(value);
    }

    public ArrayList<String> values(){
        return stackList;
    }

    public String take(){
        int lastIn=stackList.size()-1;
        String str=stackList.get(lastIn);
        stackList.remove(str);
        return str;
    }

}
