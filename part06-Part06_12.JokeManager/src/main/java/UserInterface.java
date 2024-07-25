
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class UserInterface {

    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String jk = scanner.nextLine();
                jokes.addJoke(jk);
                continue;
            } else if (command.equals("2")) {
                System.out.println(jokes.drawJoke());
                continue;
            } else if (command.equals("3")) {
                this.jokes.printJokes();
                continue;
            }
        }
    }
}