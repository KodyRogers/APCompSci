import java.util.*;
public class WhileExercises {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a number.");
        int a = sc.nextInt();
        int n = 0;
        int total = 0;        
        
        while (a != n) {
            
            n++;
            
        }
        for(int i = 1; i <= a; i++) {
                total += i;
            }
        //Yeah for loop works fine
        System.out.println(total);
    }
    
}