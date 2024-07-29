import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Recipe {  
    private String name;
    private String time;
    private ArrayList<String> ingredients;

    public Recipe(String name, String time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    
    public String getName(){
        return this.name;
    }
    public String getTime(){
        return this.time;
    }
    
    public ArrayList<String> getIngred(){
        return this.ingredients;
    }
    
    public void printRecipe(){
        for (String i : ingredients){
            System.out.println(i);
        }
    }
}
