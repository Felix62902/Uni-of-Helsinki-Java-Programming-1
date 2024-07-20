
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int tracer = 0;
        
        try (Scanner fscan = new Scanner(Paths.get(file))){
            while (fscan.hasNext()){
                int num = Integer.valueOf(fscan.nextLine());
                if (num>= lowerBound && num<= upperBound){
                    tracer ++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Numbers: "+tracer);

    }

}
