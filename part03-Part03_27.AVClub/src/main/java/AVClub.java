
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            while (true){
                String s = scanner.nextLine();
                String[] list = s.split(" ");
                if (s.equals("")){
                    break;
                }
                for(int i = 0; i < list.length; i++){
                    if(list[i].contains("av")){
                        System.out.println(list[i]);
                    }
                }
                
            }

    }
}
