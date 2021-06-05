
public class Statistics {

    private int count;
    private int sum;


    public Statistics(){
        this.count=0;
        this.sum=0;

    }

    public void addNumber(int number){
        if(number!=-1){
            count++;
            sum+=number;
        }

    }

    public int getCount(){
        return count;
    }

    public int sum(){
        return sum;
    }


    public double average(){
        if(count==0){
            return 0;
        }else {
            return (sum*1.0)/count;
        }

    }
}
