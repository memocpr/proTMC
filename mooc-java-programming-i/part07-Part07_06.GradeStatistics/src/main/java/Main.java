
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        Grades points=new Grades();

        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int point=Integer.valueOf(scanner.nextLine());
            if(point==-1){
                break;
            }
            if (point>=0 && point<=100){
                points.add(point);
            }

        }

        System.out.println("Point average (all): "+points.average());
        if (points.averagePass()>0){
            System.out.println("Point average (passing): "+points.averagePass());
        }else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: "+points.passPer());

        System.out.println("Grade distribution: ");
        points.grades();


    }

}
