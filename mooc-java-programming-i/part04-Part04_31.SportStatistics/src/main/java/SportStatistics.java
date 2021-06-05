
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games=0;
        int wins=0;
        int losses=0;
        System.out.println("File: ");
        String file=scan.nextLine();

        System.out.println("Team: ");
        String team=scan.nextLine();

        try(Scanner sc=new Scanner(Paths.get(file))) {

            while (sc.hasNextLine()){
                String[] parts=sc.nextLine().split(",");
                if (team.equals(parts[0])){
                    games++;
                    if (Integer.valueOf(parts[2])>Integer.valueOf(parts[3])){
                        wins++;
                    }else if(Integer.valueOf(parts[2])<Integer.valueOf(parts[3])){
                        losses++;
                    }
                }else if (team.equals(parts[1])){
                    games++;
                    if (Integer.valueOf(parts[2])<Integer.valueOf(parts[3])){
                        wins++;
                    }else if(Integer.valueOf(parts[2])>Integer.valueOf(parts[3])){
                        losses++;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Games: "+games);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+losses);

    }

}
