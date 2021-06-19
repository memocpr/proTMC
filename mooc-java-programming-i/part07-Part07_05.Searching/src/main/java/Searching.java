
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }


       /* ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(5, "A"));
        books.add(new Book(7, "B"));
        books.add(new Book(9, "C"));
        books.add(new Book(14, "D"));

        int indexSearched = binarySearch(books, 9);

        if (indexSearched< 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(indexSearched));
        }

        System.out.println(indexSearched);*/
    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i=0; i<books.size(); i++){
            int oneId=books.get(i).getId();
            if(searchedId==oneId){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {

        int startIndex = 0;
        int endIndex = books.size() - 1;
        int midIndex = 0;

        while (true) {
            if(endIndex<startIndex){
                return -1;
            }

            midIndex = ((startIndex + endIndex) / 2);

            if (searchedId > books.get(midIndex).getId()) {
                startIndex = midIndex + 1;
                continue;
            } else if (searchedId < books.get(midIndex).getId()) {
                endIndex = midIndex - 1;
                continue;
            } else if (searchedId == books.get(midIndex).getId()) {
                return midIndex;
            }

        }
    }
}

