
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String f = scanner.nextLine();

        try ( Scanner scan = new Scanner(Paths.get(f))) {
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
