import java.util.Scanner;
import java.lang.Math;

public class Lesson12b {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter an integer");
        double a = sc.nextDouble();
        System.out.println("Please enter another integer");
        double b = sc.nextDouble();
        
        if (a >= b) {
            System.out.println("Largest is " + a);
        } else {
            System.out.println("Largest is " + b);
        }
        
    }
    
}