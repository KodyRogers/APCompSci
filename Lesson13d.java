import java.util.*;
public class Lesson13d {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a grade 0-4.");
        int x = sc.nextInt();
      
        
        if (x == 4) {
            
            System.out.println("A");
            
        } 
        else if (x == 3){
            
            System.out.println("B");
            
        }
       else if (x == 2){
            
            System.out.println("C");
            
        }    
       else if (x == 1){
            
            System.out.println("D");
            
        }
       else if (x == 0){
            
            System.out.println("F");
            
        } else {
            System.out.println("No");
        }   
    }
    
}