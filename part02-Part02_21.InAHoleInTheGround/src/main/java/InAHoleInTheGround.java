import java.util.Scanner;
        
public class InAHoleInTheGround {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int num = Integer.valueOf(scanner.nextLine());
        while ( num >= 0) {
            printText();
            num -= 1;
        }
    }
    public static void printText() {
        // Write some code in here
        System.out.println("In a hole in the ground there lived a method");
    }
}
