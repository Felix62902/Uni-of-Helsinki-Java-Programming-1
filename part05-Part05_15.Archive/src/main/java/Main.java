
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<Item>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            Item newItem = new Item(identifier, name);
            
            boolean exists = false;
            for(Item i : items){
                if(newItem.equals(i)){
                    exists = true;
                    break;
                }
            }
            if (exists == false){
                items.add(newItem);
            }
        }
        System.out.println("==Items==");
        for (Item i: items){
            System.out.println(i);
        }

    }
}
