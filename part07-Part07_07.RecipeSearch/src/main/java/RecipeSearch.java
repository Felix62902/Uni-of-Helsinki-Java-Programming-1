
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    ArrayList<String> content = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String file = scanner.nextLine();
        System.out.println("Commands: \n list - lists the recipes \n stop - stops the program \n");
        ArrayList<Recipe> recipes = readFile(file);

//        for(Recipe r: recipes){
//            System.out.println( r.getName());
//            System.out.println(r.getTime());
//            r.printRecipe();
//        }
        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                for (Recipe recipe : recipes) {
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
                }
                System.out.println("");
            } else if (command.equals("find name")){
                System.out.println("Searched word: ");
                String word = scanner.nextLine();
                System.out.println(" ");
                System.out.println("Recipes:");
                for(Recipe r: recipes){
                    if(r.getName().contains(word)){
                        System.out.println(r.getName() + ", cooking time: " + r.getTime());
                    }
                }
            } else if( command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                String time = scanner.nextLine();
                System.out.println("Recipes:");
                for(Recipe r: recipes){
                    if(Integer.valueOf((r.getTime())) <= Integer.valueOf(time)){
                        System.out.println(r.getName() + ", cooking time: " + r.getTime());
                    }
                }
            } else if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ing = scanner.nextLine();
                for(Recipe r : recipes){
                    ArrayList<String> ingred = r.getIngred();
                    for(String ingree : ingred){
                        if(ingree.equals(ing)){
                            System.out.println(r.getName() + ", cooking time: " + r.getTime());
                        }
                    }
                }
            }
        }
    }

    public static ArrayList<Recipe> readFile(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        ArrayList<String> Holder = new ArrayList<>();
        String name = "";
        String time = "";
        ArrayList<String> ingredient = new ArrayList<>();
        // start reading the file. logic is to read into holder until space, then add create new object and reset holder
        try ( Scanner fread = new Scanner(Paths.get(file))) {
            while (fread.hasNextLine()) {
                String line = fread.nextLine();
                Holder.add(line);
//                System.out.println("Holder is now" + Holder);

                if (line.equals("") || !fread.hasNextLine()) {
                    // end of recipe 1, create new object and reset to ready for next
                    int counter = 1;
                    for (String s : Holder) {
                        if (counter == 1) {
                            name = name + s;
                            counter++;
                            continue;
                        } else if (counter == 2) {
                            time = time + s;
                            counter++;
                            continue;
                        } else {
                            ingredient.add(s);
                        }
                    }
                    Recipe newrecipe = new Recipe(name, time, ingredient);
                    recipes.add(newrecipe);

                    Holder = new ArrayList<>(); // reset the holder
                    name = "";
                    time = "";
                    ingredient = new ArrayList<>();
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipes;
    }
}
