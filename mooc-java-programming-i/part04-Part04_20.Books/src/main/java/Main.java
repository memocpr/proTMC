import java.util.ArrayList;
import java.util.Scanner;

public class
Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner sc=new Scanner(System.in);
        ArrayList<Book> bookList=new ArrayList<>();
        String name;
        int pages;
        int year;

        while (true){
            name=sc.nextLine();
            if(name.isEmpty()){
                break;
            }

            pages=Integer.valueOf(sc.nextLine());
            year=Integer.valueOf(sc.nextLine());

            Book oneBook=new Book(name, pages, year);
            bookList.add(oneBook);
        }

        System.out.println("What information will be printed? ");
        name=sc.nextLine();
        if (name.equals("everything")){
            for (int i=0; i<bookList.size(); i++){
                System.out.println(bookList.get(i));
            }
        }else if(name.equals("name")) {
            for (int i=0; i<bookList.size(); i++){
                System.out.println(bookList.get(i).getName());
            }
        }

    }
}
