
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] split = input.split(" ");
            String command = split[0];
            int amount = Integer.valueOf(split[1]);

            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                if(first.contains()==0){
                    break;
                }
                if(first.contains() <amount && first.contains() != 0){
                    second.add(first.contains());
                    first.remove(1000);
                    continue;
                }
                second.add(amount);
                first.remove(amount);
                continue;
            } else if (command.equals("remove")) {
                second.remove(amount) ;
                continue;
            }

        }

    }

}