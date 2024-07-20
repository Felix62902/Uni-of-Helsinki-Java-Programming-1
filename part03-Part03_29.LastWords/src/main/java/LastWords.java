
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.nextLine();
            String[] list = s.split(" ");
            if(s.equals("")){
                break;
            }
            System.out.println(list[list.length  -1]);
            
        }

    }
}
