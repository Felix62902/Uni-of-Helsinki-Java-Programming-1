
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //which file
        System.out.println("File: ");
        String file = scan.nextLine();
        ArrayList<NewClass> stats = readFile(file);

        //which team
        System.out.println("Team: ");
        String team = scan.nextLine();
        boolean found = false;

        for (NewClass i : stats) {
            if (i.name.equals(team)) {
                System.out.println("Games: " + i.games);
                System.out.println("Wins: " + i.wins);
                System.out.println("Losses: " + i.loss);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        }
    }

    public static ArrayList<NewClass> readFile(String file) {

        ArrayList<NewClass> teams = new ArrayList<>();

        try ( Scanner fscan = new Scanner(Paths.get(file))) {
            while (fscan.hasNextLine()) {
                String line = fscan.nextLine();
                String[] data = line.split(",");

                NewClass team1 = new NewClass(data[0]);
                NewClass team2 = new NewClass(data[1]);
                int homeScore = Integer.valueOf(data[2]);
                int visitScore = Integer.valueOf(data[3]);
                // adding teams to Array without duplication
                if (!teams.contains(team1)) {
                    teams.add(team1);
                }
                if (!teams.contains(team2)) {
                    teams.add(team2);
                }

                for (NewClass team : teams) {
                    if (team.name.equals(data[0])) {
                        if (homeScore > visitScore) {
                            team.addWin();
                        } else {
                            team.addLoss();
                        }
                    }
                    if (team.name.equals(data[1])) {
                        if (visitScore > homeScore) {
                            team.addWin();
                        } else {
                            team.addLoss();
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return teams;
    }

}
