
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 9999) {
                break;
            }
            list.add(num);
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int tracker = list.get(0);
        int getter = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < tracker) {
                tracker = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++)  {
            if (list.get(i) == tracker) {
                break;
            }
            getter+=1;   
        }
        System.out.println("Smallest number: " + tracker);
        System.out.println("Found at index: "+ getter);

    }
}
