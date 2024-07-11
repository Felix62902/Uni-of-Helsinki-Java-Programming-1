
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int num = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        while (num>= 0){
            counter+=num;
            num-=1;
        }
        System.out.println("The sum is " + counter);

    }
}
