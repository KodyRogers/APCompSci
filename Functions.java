import java.util.Scanner;

public class Functions {
    
    
    // build some functions or methods or subroutine
    
    // return the highest value passed into this function
    // assume a != b != c
    public int a() {
        
        Scanner nint = new Scanner(System.in);
        
        System.out.print("Please enter 3 intergers: ");
        int a = nint.nextInt();
        int b = nint.nextInt();
        int c = nint.nextInt();
        return max(a,b,c);
        
    }
    
    public int max(int a, int b, int c){
        
        if (a > b && a > c) {
            return a;
        } 
        else if (b > a && b > c) {
            return b;
        }
        else {
            return c;
        }
        
    }
    
    
    
    
    
    public void d() {
        
        System.out.println("Will I eat food today?");
        
    }
    
    
}