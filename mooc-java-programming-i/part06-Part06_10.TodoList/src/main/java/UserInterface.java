import java.util.Scanner;

public class UserInterface {

    private TodoList toDo;

    private Scanner scanner;

    public UserInterface(TodoList td, Scanner sc){
        this.toDo=td;
        this.scanner=sc;
    }

    public void start(){
        while (true){
            System.out.println("Command:");
            String str=scanner.nextLine();
            if (str.equals("stop")){
                break;
            }
            if (str.equals("add")){
                System.out.println("To add:");
                str=scanner.nextLine();
                toDo.add(str);
            }
            if (str.equals("list")){
                toDo.print();
            }
            if (str.equals("remove")){
                System.out.println("Which one is removed?");
                str=scanner.nextLine();
                    toDo.remove(Integer.valueOf(str));
            }
        }
    }
}
