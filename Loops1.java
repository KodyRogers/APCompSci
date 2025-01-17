import java.util.*;
public class Loops1 {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a number:");
            double a = sc.nextDouble();
                
        while (a > 0) {
            
            System.out.println(a);
            a-=0.5;
            
        }
            
        
        
    }
    
    
    
}