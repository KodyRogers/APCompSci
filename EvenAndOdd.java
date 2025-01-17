import java.util.Scanner;

public class EvenAndOdd {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter any whole number");
        int a = sc.nextInt();
        
        int b = (a%2);
        
        if (b == 1) {
            System.out.println("You have an odd number.");
        } else {
            System.out.println("You have an even number.");
        }
        
    }
    
}