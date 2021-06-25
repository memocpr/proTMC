
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> textLines=new ArrayList<>();
        System.out.println("File to read :");
        String str=scanner.nextLine();

        try (Scanner sc=new Scanner(Paths.get(str))){
            while (sc.hasNextLine()){
                str=sc.nextLine();
                textLines.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Commands:");
        System.out.println("list - lists recipes");
        System.out.println("stop - stops the problem");

        while (true){
            System.out.println("Enter command:");
            str=scanner.nextLine();
            if (str.equals("stop")){
                break;
            }

            if (str.equals("list")){
                /*ArrayList<String> strs=list(textLines);
                System.out.println("Recipes:");
                for (String x:strs){
                    System.out.println(x);
                }*/

                showRecipes(textLines);

            }

            if (str.equals("find name")){
                /*System.out.println("Searched word:");
                str=scanner.nextLine();
                System.out.println(search(textLines, str));*/


            }
        }

    }
    /*

    public static ArrayList<String> list(ArrayList<String> lines){


        ArrayList<String> strings=new ArrayList<>();
        for (int i=0; i<lines.size(); i++){

            if(i==0){
                strings.add(lines.get(i)+", cooking time: "+lines.get(i+1));
            }
            if (lines.get(i).equals("")){
                strings.add(lines.get(i+1)+", cooking time: "+lines.get(i+2));
            }
        }
        return strings;
    }

    public static String search(ArrayList<String> lines, String nm){
        ArrayList<String> strs=list(lines);
        for (String x:strs){
            if (x.contains(nm)){
                return x;
            }
        }
        return null;
    }*/

    /*

    // for loop
    public static void list(ArrayList<String> list){

        int count=0;

        for (String x: list){
            if (x.equals("")){
                count++;
            }
        }

        int start=0;
        int check=0;

        for (int i=0; i<count+1; i++){

            for (int y=start; y<list.size(); y++){

                if (list.get(y).equals("")){
                    start=y+1;
                    break;
                }
                System.out.println(list.get(y));
            }

            System.out.println("y: "+start);

            if (start==check){
                System.out.println("stop !!!");
            }else {
                check=start;
            }
            System.out.println(">>>>>>>>>>");
        }
    }*/

    /*
    // while loop
    public static void list(ArrayList<String> list){

        int start=0;
        int check=0;

        while (true){

            for (int y=start; y<list.size(); y++){

                if (list.get(y).equals("")){
                    start=y+1;
                    break;
                }
                System.out.println(list.get(y));
            }

            System.out.println("y: "+start);

            if (start==check){
                break;
            }else {
                check=start;
            }
            System.out.println(">>>>>>>>>>");
        }
    }*/



    public static ArrayList<Recipe> separation(ArrayList<String> list){

        ArrayList<Recipe> recipes=new ArrayList<>();
        int start=0;
        int check=0;

        while (true){

            String name=null;
            int time=0;
            ArrayList<String> ing=new ArrayList<>();
            Recipe oneRecipe;

            for (int y=start; y<list.size(); y++){

                if (list.get(y).equals("")){
                    start=y+1;
                    break;
                }

                if (y==start){
                    //System.out.println("name :"+list.get(y));
                    name=list.get(y);
                }else if(y==start+1){
                    //System.out.println("time :"+Integer.valueOf(list.get(y)));
                    time=Integer.valueOf(list.get(y));
                }else {
                    //System.out.println("ing: "+list.get(y));
                    ing.add(list.get(y));
                }
            }

            oneRecipe=new Recipe(name, time, ing);
            recipes.add(oneRecipe);

            // check if index of empty line is same
            if (start==check){
                break;
            }else {
                check=start;
            }
            //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }

        //System.out.println(recipes.size());
        return recipes;
    }

    public static void showRecipes(ArrayList<String> list){

        ArrayList<Recipe> recipes=separation(list);
        for (Recipe rc:recipes){
            System.out.println(rc);
        }
    }

}
