import java.util.*;

public class LogicTester {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LogicTester lg = new LogicTester();
        
        System.out.println("Please enter a number 1 - 100");
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();
        
        boolean check1 = lg.yeet(a);
        boolean check2 = lg.yeet1(b);
        if (check1 == true || check2 == true) {
            System.out.println("You have a special or stupid cat.");
        } else {
            System.out.println("You have a very smart doggo");
        }
        
    }
    public boolean yeet(int a) {
        
        if ( !(a >= 13 && a <= 21) || a != 60) {
            
            return true;
            
        }  else {
            
            return false;
            
        }
        
    }
    public boolean yeet1(int b) {
        
        if (b == 19 || b == 60) {
            
            return true;
            
        } else {
            return false;
        }
        
    }
}