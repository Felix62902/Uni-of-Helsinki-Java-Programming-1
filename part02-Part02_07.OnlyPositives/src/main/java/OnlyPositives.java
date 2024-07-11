
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            Integer i = Integer.valueOf(scanner.nextLine());
            if (i < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (i == 0) {
                break;
            } else {
                System.out.println(i * i);
            }

        }
    }
}
