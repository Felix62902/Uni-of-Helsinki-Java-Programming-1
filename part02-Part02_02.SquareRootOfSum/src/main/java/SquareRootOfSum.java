
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        double one = Math.sqrt(first);
        double two = Math.sqrt(second);
        
        System.out.println((int) (one + two));

    }
}
