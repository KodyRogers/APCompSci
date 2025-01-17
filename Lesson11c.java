import java.util.Scanner;
import java.lang.Math;

public class Lesson11c {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a integer value.");
        int a = sc.nextInt();
        System.out.println("Please enter another integer.");
        int b = sc.nextInt();
        
        if (a == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}