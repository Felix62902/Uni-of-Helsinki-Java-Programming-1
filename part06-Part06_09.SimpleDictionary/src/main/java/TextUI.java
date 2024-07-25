
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.simpleDict = dict;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if ( command.equals("end")){
                break;
            } else if (command.equals("add")){
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translate = scanner.nextLine();
                this.simpleDict.add(word, translate);
                continue;
            } else if (command.equals("search")){
                System.out.println("To be translated: ");
                String word = scanner.nextLine();
                if(simpleDict.translate(word) != null){
                    System.out.println("Translation: " + simpleDict.translate(word));
                } else {
                    System.out.println("Word "+ word + " was not found");
                }
                continue;
            }
            else {
                System.out.println("Unknown command");
                continue;
            }
        }
        System.out.println("Bye bye!");
    }

}
