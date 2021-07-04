
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList td, Scanner sc){

        this.scanner=sc;
        this.todoList=td;

    }

    public void start(){

        while (true){

            System.out.println("Command: ");
            String str=scanner.nextLine();

            if (str.equals("stop")){
                break;
            }

            if (str.equals("add")){
                System.out.println("To add: ");
                str=scanner.nextLine();
                todoList.add(str);
            }

            if(str.equals("remove")){
                System.out.println("Which one is removed? ");
                str=scanner.nextLine();
                int index=Integer.valueOf(str);
                todoList.remove(index);
            }

            if (str.equals("list")){
                todoList.print();
            }
        }

    }




}
