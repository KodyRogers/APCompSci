import java.util.Scanner;
import java.lang.Math;

public class Lesson12c {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a test score");
        double a = sc.nextDouble();
        
        if (a <= 100 && a >= 0) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
        
    }
    
}