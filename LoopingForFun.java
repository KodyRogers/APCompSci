import java.util.Scanner;

public class LoopingForFun {
    
    public static void main(String[] args) {
    
    Scanner sc_int = new Scanner(System.in);
    
    System.out.print("Please enter your first integer: ");
    int first = sc_int.nextInt();
    System.out.print("Please enter your second integer: ");
    int second = sc_int.nextInt();
        
        
    int total = 0;    
        
        
    if (first < second) {
        for (int i = first; i <= second; i++) {
        System.out.println(i);    
            
        }
        
        for (int i = second; i >= first; i--) {
        System.out.println(i);
            
        }
        
        for (int i = first; i <= second; i++) {
        total += i;    
        }
        
        System.out.println("the sum of your loop is " + total);
        }
    }
    
}