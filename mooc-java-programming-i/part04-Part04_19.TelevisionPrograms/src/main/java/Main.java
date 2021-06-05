import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String name;
        int dure;
        while (true){
            System.out.println("Name: ");
            name=scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println("Duration: ");
            dure=Integer.valueOf(scanner.nextLine());
            TelevisionProgram pr=new TelevisionProgram(name, dure);
            programs.add(pr);
        }

        System.out.println("Program's maximum duration? ");
        dure=Integer.valueOf(scanner.nextLine());


        for (int i=0; i<programs.size(); i++){
            int dr=programs.get(i).getDuration();
            if(dr<=dure){
                System.out.println(programs.get(i));
            }
        }
    }
}
