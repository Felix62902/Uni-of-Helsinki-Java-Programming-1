
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int i = Integer.valueOf(scanner.nextLine());
            if (i == 0) {
                if (counter == 0){
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println((double) sum/counter);
                break;
            } else if (i > 0) {
                counter += 1;
                sum += i;
            }
            continue;
        }
    }
}
