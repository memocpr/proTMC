
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i=0; i<number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i=1; i<=number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {

        for (int y=size-1; y>=0; y--){
            printSpaces(y);
            printStars(size-y);
        }

    }

    public static void christmasTree(int height) {
        for (int y=height-1; y>=0; y--){
            printSpaces(y);
            printStars(2*(height-y)-1);
        }
        for (int i=0; i<2; i++){
            printSpaces(height-2);
            printStars(3);

        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        //printStars(3);
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
