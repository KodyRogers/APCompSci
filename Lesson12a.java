import java.util.Scanner;
import java.lang.Math;

public class Lesson12a {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter an integer");
        int a = sc.nextInt();
        System.out.println("Please enter another integer");
        int b = sc.nextInt();
        System.out.println("Please enter one more integer");
        int c = sc.nextInt();
        
        double d = (double)(c + b + a)/3;
        System.out.println(d);
        if (d >= 89.5) {
            System.out.println("Above Average");
        } else {
            System.out.println("Not Above Average");
        }
        
    }
    
}