
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = 0;
        String longestName ="";
        int listLength = 0;
        while(true){
            String s = scanner.nextLine();
            String[] list = s.split(",");
            if(s.equals("")){
                break;
            }
            if(list[0].length() > longestName.length()){
                longestName = list[0];
            }
            years+=Integer.valueOf(list[1]);
            listLength ++;
            
        }
        System.out.println("Longest name:  "+ longestName);
        System.out.println("Average of the birth years:" + ((double)years/listLength));   
    }
}
