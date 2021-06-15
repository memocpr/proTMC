import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner sc, SimpleDictionary sd){
        this.scanner=sc;
        this.simpleDictionary=sd;
    }

    public void start(){
        while (true){
            System.out.println("Command: ");
            String word=scanner.nextLine();
            if (word.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            if(word.equals("add")){
                System.out.println("Word: ");
                String w=scanner.nextLine();
                System.out.println("Translation: ");
                String t=scanner.nextLine();
                simpleDictionary.add(w,t);
                continue;
            }
            if(word.equals("search")){
                System.out.println("To be translated: ");
                word=scanner.nextLine();
                String str=simpleDictionary.translate(word);
                if (str==null){
                    System.out.println("Word "+word+" was not found");
                }else {
                    System.out.println(str);
                }

                continue;
            }
            System.out.println("unknown command");
        }

    }
}
