
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int i = Integer.valueOf(scanner.nextLine());
            if (i == 0) {
                System.out.println("Number of negative numbers: " + counter);
                break;
            } else if (i < 0) {
                counter += 1;
            }
            continue;
        }
    }
}
