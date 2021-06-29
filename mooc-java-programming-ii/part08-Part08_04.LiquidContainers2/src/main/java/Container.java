public class Container {

    private int amount;



    public  int contains(){
        return amount;
    }

    public void add(int liquid){

        if(liquid>=0){

            if (amount+liquid<=100){
                amount+=liquid;
            }else {
                amount=100;
            }
        }
    }

    public void remove(int liquid){

        if (liquid>=0){

            if (amount-liquid>=0){
                amount-=liquid;
            }else {
                amount=0;
            }

        }

    }


    public String toString(){

        return amount+"/100";

    }

}
