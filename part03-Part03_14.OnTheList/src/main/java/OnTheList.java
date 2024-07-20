
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
         Boolean found = false;
        System.out.println("Search for? ");
        String name = scanner.nextLine();
        for ( int i =  0; i < list.size(); i++){
            if(list.get(i).equals(name)){
                System.out.println(name+ " was found!");
                found = true;
                break;
            } 
        }
        if (found == false){
            System.out.println(name+ " was not found!");
        }
    }
}
