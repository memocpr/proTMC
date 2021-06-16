public class Container {

    private int total;

    public Container(){
        this.total=0;
    }

    public int contains(){
        return total;
    }

    public void add(int amount){
        if (amount>=0){
            if(total+amount<=100){
                total+=amount;
            }else {
                total=100;
            }
        }
    }


    public void remove(int amount){
        if (amount>=0){
            if (total-amount>=0){
                total-=amount;
            }else {
                total=0;
            }
        }
    }

    public String toString(){
        return total+"/100";
    }
}
