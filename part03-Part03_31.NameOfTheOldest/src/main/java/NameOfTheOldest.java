
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name ="";
        while(true){
            String s = scanner.nextLine();
            String[] list = s.split(",");
            if(s.equals("")){
                break;
            }
            if(Integer.valueOf(list[1]) > oldest){
                oldest = Integer.valueOf(list[1]);
                name = list[0];
            }
            
        }
        System.out.println("Name of the oldest: "+ name);

    }
}
