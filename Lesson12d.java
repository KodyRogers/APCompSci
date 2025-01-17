import java.util.Scanner;
import java.lang.Math;

public class Lesson12d {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the tempature");
        double a = sc.nextDouble();
        
        if (a >= 99 && a <= 102) {
            System.out.println("");
        } else {
            System.out.println("WARNING");
        }
        
    }
    
}