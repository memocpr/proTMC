
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str="";
        while (true){

            str=scanner.nextLine();

            if (str.equals("")){
                break;
            }

            String[] splitStr=str.split(" ");

            for (int i=0; i<splitStr.length; i++){

                if (splitStr[i].contains("av")){
                    System.out.println(splitStr[i]);
                }
            }
        }

    }
}
