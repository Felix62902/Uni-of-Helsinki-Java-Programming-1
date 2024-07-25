
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

    public String longest() {
        if (elements.size() == 0) {
            return null;
        }
        int first = this.elements.get(0).length();
        String longest = this.elements.get(0);

        for (int i = 0; i < elements.size(); i++) {
            if (this.elements.get(i).length() > first) {
                first = this.elements.get(i).length();
                longest = this.elements.get(i);
            }
            
        }
        return longest;

    }
}
