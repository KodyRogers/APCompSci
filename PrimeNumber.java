import java.util.Scanner;
public class PrimeNumber {
    
    public static void main (String[] args) {
        
        PrimeNumber pn = new PrimeNumber();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a two digit number to check if it's prime:");
        int a = sc.nextInt();
        
        if (a < 2) {
            System.out.println("You do not have a prime number");
            System.exit(0);
        } 
        
        boolean check1 = pn.math(a);
        boolean check2 = pn.math2(a);
    
        if (check1 == true && check2 == false) {
        
            System.out.println("You do not have a prime number");
        } else {
            if (a < 2) {
                System.out.println("You do not have a prime number");
            } else {
            System.out.println("You have a prime number");
            }
        }
    }
    public boolean math(int a) {
        
        if (a < 2) {
            return false;
        }
        
        
        double b = a%2;
        double c = a%3;
        double d = a%5;
        double e = a%7;
        double f = a%11;
        
        if (b == 0 || c == 0 || d == 0 || e == 0 || f == 0) {
            
            return true;
            
        } else {
            
            return false;
        }
        
    } 
    
    public boolean math2(int a) {
        
        if (a == 2 || a == 3 || a == 5 || a == 7 || a == 11) {
            
            return true;
            
        } else {
            
            return false;
        }
        
    }
    
}