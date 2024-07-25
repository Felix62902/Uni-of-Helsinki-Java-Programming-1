import java.util.ArrayList;


/**
 *
 * @author User
 */
public class Stack {
    private ArrayList<String> list;
    
    public Stack(){
        this.list = new ArrayList<String>();
    }
    
    public boolean isEmpty(){
        return(this.list.isEmpty());
    }
    
    public void add(String value){
        this.list.add(value);
    }
    
    public ArrayList<String> values() {
        return this.list;
    }
    
    public String take(){
        String topmost = this.list.get(this.list.size()-1);
        this.list.remove(topmost);
        return topmost;
    }
}
