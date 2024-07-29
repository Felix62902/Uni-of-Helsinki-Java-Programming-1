
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] split = input.split(" ");
            String command = split[0];
            int amount = Integer.valueOf(split[1]);

            if (command.equals("add")) {
                if (first + amount <= 100 && amount >= 0) {
                    first += amount;
                    continue;
                } else if (first + amount >= 100 && amount >= 0) {
                    first = 100;
                    continue;
                }
                continue;
            } else if (command.equals("move")) {
                if(first==0){
                    break;
                }
                if(first<amount && first != 0){
                    second += first;
                    first = 0;
                    continue;
                }
                second += amount;
                first -= amount;
                if (first < 0) {
                    first = 0;
                }
                if (second > 100) {
                    second = 100;
                }
                continue;
            } else if (command.equals("remove")) {
                if (second - amount < 0) {
                    second = 0;
                    continue;
                }
                second -= amount;
                first += amount;
                if (first > 100) {
                    first = 100;
                }
                continue;
            }

        }

    }

}
