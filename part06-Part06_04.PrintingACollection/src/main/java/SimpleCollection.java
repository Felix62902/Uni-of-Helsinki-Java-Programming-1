
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        int size = this.elements.size();
        String element = " elements:";
        
        
        if(this.elements.isEmpty()){
            return "The collection " + this.name +" is empty.";
        }
        if(size ==1){
            element = " element:";
        }
        String s = "The collection " + this.name +" has " + size + element;
        
        for (int i = 0; i<elements.size();i++){
            s = s + "\n" + this.elements.get(i); 
        }
        return s;
    }
    
}
