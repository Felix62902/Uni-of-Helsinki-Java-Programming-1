
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int i = Integer.valueOf(scanner.nextLine());
            if (i == 0) {
                System.out.println("Number of numbers: " + counter);
                System.out.println("Sum of the numbers: "+ sum);
                break;
            }
            counter += 1;
            sum += i;
            continue;
        }
    }
}
