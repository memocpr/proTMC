
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names=new ArrayList<>();
        String oneName;

        String name,sName,idNum;
        while (true){
            System.out.println("First name: ");
            name=scanner.nextLine();

            if (name.isEmpty()){
                break;
            }

            System.out.println("Last name: ");
            sName=scanner.nextLine();
            System.out.println("Identification number: ");
            idNum=scanner.nextLine();

            PersonalInformation p=new PersonalInformation(name, sName, idNum );
            infoCollection.add(p);

            oneName=p.getFirstName()+" "+p.getLastName();
            names.add(oneName);


        }

        for (String str: names){

            System.out.println(str);
        }

    }
}
