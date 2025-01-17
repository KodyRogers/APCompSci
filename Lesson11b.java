import java.util.Scanner;
import java.lang.Math;

public class Lesson11b {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a decimal value.");
        double a = sc.nextDouble();
        
        if (a == 48.729) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}