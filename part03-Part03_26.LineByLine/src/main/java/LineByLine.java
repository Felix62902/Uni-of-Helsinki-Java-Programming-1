
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            String[] split = s.split(" ");
            if (s.equals("")) {
                break;
            } else {
                
                for (int i = 0; i < split.length; i++) {
                    System.out.println(split[i]);
                }
            }
        }
    }
}
