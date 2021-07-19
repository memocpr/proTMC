
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputsN=new ArrayList<>();
        List<String> inputsP=new ArrayList<>();
        while (true){
            System.out.println("Input numbers, type 'end' to stop.");
            String row=scanner.nextLine();
            if(row.equals("end")){
                break;
            }
            if (Integer.valueOf(row)<0){
                inputsN.add(row);
            }else {
                inputsP.add(row);
            }

        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input=scanner.nextLine();

        if (input.equals("n")){
            double average=inputsN.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .average()
                    .getAsDouble();
            System.out.println("Average number: "+average);
        }
        if(input.equals("p")){
            double average=inputsP.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .average()
                    .getAsDouble();
            System.out.println("Average number: "+average);
        }

    }
}
