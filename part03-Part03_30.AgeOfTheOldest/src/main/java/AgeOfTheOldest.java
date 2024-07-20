
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while(true){
            String s = scanner.nextLine();
            String[] list = s.split(",");
            if(s.equals("")){
                break;
            }
            if(Integer.valueOf(list[1]) > oldest){
                oldest = Integer.valueOf(list[1]);
            }
            
        }
        System.out.println("Age of the oldest: "+ oldest);

    }
}
