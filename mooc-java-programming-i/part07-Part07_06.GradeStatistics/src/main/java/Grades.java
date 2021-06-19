import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> points;

    public Grades(){
        this.points=new ArrayList<>();
    }

    public ArrayList<Integer> add(int point){
        points.add(point);
        return points;
    }

    public double average(){
        int sum=0;

        for (Integer x:points){
            sum+=x;
        }
        return (sum*1.0)/points.size();
    }


    public double averagePass(){
        int sum=0;
        int count=0;

        for (Integer x:points){
            if(x>=50){
                sum+=x;
                count++;
            }
        }

        if (count>=1){
            return (sum*1.0)/count;
        }else {
            return -1;
        }
    }

    public double passPer(){
        int count=0;
        for (Integer x:points){
            if(x>=50){
                count++;
            }
        }
        return (count*1.0*100)/points.size();
    }

    public void grades(){
        int five=0;
        int four=0;
        int three=0;
        int two=0;
        int one=0;
        int zero=0;
        for (Integer x: points){

            if ( x<=100 && x>=90  ){
                five++;
            }else if ( x<90 && x>=80  ){
                four++;
            }else if ( x<80 && x>=70  ){
                three++;
            }else if ( x<70 && x>=60  ){
                two++;
            }else if ( x<60 && x>=50  ){
                one++;
            }else if ( x<50){
                zero++;
            }
        }

        System.out.println("5: "+printStar(five));
        System.out.println("4: "+printStar(four));
        System.out.println("3: "+printStar(three));
        System.out.println("2: "+printStar(two));
        System.out.println("1: "+printStar(one));
        System.out.println("0: "+printStar(zero));
    }

    public String printStar(int num){
        String str="";
        for (int i=0; i<num; i++){
            str+= "*";
        }
        return str;
    }



}
