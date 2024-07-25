import java.util.Scanner;

/**
 *
 * @author User
 */
public class UserInterface {
    private TodoList toDoList;
    private Scanner scanner;
    public UserInterface(TodoList tdl, Scanner scanner){
        this.toDoList = tdl;
        this.scanner =scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            } else if (command.equals("add")){
                System.out.println("To add: ");
                String add = scanner.nextLine();
                this.toDoList.add(add);
            } else if (command.equals("list")){
                this.toDoList.print();
            } else if (command.equals("remove")){
                System.out.println("Which one is removed? ");
                int rm = Integer.valueOf(scanner.nextLine());
                this.toDoList.remove(rm);
            }
        }
    }
    
    
            
    
}
