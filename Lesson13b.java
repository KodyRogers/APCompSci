import java.util.*;
public class Lesson13b {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a grade.");
        int x = sc.nextInt();
        
        if (x >= 60) {
            
            System.out.println("Passing");
            
        } else {
            
            System.out.println("Failing");
            
        }
        
    }
    
}