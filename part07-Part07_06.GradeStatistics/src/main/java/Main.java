
import java.util.Scanner;
import java.util.ArrayList; 

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPoint = 0;
        int tracker = 0;
        int totalPassedPoint = 0;
        int passedTracker = 0;
        ArrayList<Integer> grades = new ArrayList<Integer>();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        
        while (true){
            int point = Integer.valueOf(scanner.nextLine());
            if(point == -1){
                break;
            }
            if(point>0 && point <101){
                totalPoint+=point;
                tracker++;
                grades.add(point);
            } 
            if (point>=50 && point <101){
                totalPassedPoint+=point;
                passedTracker++;
            }
        }
        double average = ((double)totalPoint/ tracker) ;
        double passedAvg = ((double)totalPassedPoint/ passedTracker) ;
        System.out.println("Point average (all): " + average);
        if(totalPassedPoint == 0){
            System.out.println("Point average (passing): -");
        } else {
             System.out.println("Point average (passing): "+ passedAvg);
        }
        double passPercent = 100 * (double)passedTracker/ tracker;
        System.out.println("Pass percentage: "+ passPercent);
        System.out.println("Grade distribution: ");
       checkGrades(grades);
    }
    
    public static void checkGrades(ArrayList<Integer> grades){
        int five = 0;
        int four = 0;
        int three = 0;
        int two = 0;
        int one = 0;
        int zero = 0;
        
        for(Integer i: grades){
            if(i<50){
                zero++;
            } else if (i<60){
                one++;
            } else if( i<70){
                two++;
            }else if( i<80){
                three++;
            }else if( i<90){
                four++;
            } else {
                five++;
            }
        }
        System.out.println("5: "+ printStar(five));
        System.out.println("4: "+ printStar(four));
        System.out.println("3: "+ printStar(three));
        System.out.println("2: "+ printStar(two));
        System.out.println("1: "+ printStar(one));
        System.out.println("0: "+ printStar(zero));
        
    }
    
    public static String printStar(int number){
        String stars="";
        for(int i =0;i<number;i++){
            stars = stars+"*";
        }
        return stars;
    }
}
