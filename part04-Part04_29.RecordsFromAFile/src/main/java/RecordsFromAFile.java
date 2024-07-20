
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try ( Scanner fscan = new Scanner(Paths.get(file))) {
            while (fscan.hasNextLine()) {
                String s = fscan.nextLine();
                String[] parts = s.split(",");
                String y = "years";
                if(parts[1].equals("1")){
                    y = "year";
                }
                System.out.println(parts[0] + ", age: " + parts[1] + " " +y);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
