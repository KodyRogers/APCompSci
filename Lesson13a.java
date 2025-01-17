import java.util.*;
public class Lesson13a {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int x = sc.nextInt();
        
        if (x >= 0) {
            
            System.out.println("Positive");
            
        } else {
            
            System.out.println("Negative");
            
        }
        
    }
    
}