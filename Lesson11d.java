import java.util.Scanner;
import java.lang.Math;
public class Lesson11d {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number:");
        int a = sc.nextInt();
        
        int b = a%2;
        if (b != 1) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    
}