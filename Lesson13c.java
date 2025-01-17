import java.util.*;
public class Lesson13c {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int x = sc.nextInt();
        System.out.println("Please enter another integer.");
        int y = sc.nextInt();
        
        if (x > y) {
            
            System.out.println(x + " is larger");
        } 
        else if (x == y) {
            System.out.println("EQUAL");
        } else {
            
            System.out.println(y + " is larger");
            
        }
        
    }
    
}