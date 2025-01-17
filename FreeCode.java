import java.util.*;
public class FreeCode {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        
        System.out.println("Would you like to guess my 2 random numbers between 1 and 3 (y or n)");    
        String a = sc.nextLine();
        
        while (a.equalsIgnoreCase("Yes") || a.equalsIgnoreCase("y")) {
            
            int b = (int)(Math.random() * 3) + 1;
            int f = (int)(Math.random() * 3) + 1;
            
            System.out.println("Guess my 2 random numbers 1 to 3");
            int c = sci.nextInt();
            int e = sci.nextInt();
            
            if (c == b && e == f) {
                
                System.out.println("You win");
                a = "No";
            } else {
                
                System.out.println("The random numbers were " + b + " and," + f);
                System.out.println("You are wrong, would you like to try again (y or n)");
                String d = sc.nextLine();
                if (d.equalsIgnoreCase("no") || d.equalsIgnoreCase("n")) {
                    a = "No";
                } else {
                    a = "Yes";
                }   
            }
        }
        
        System.out.println("Thanks for playing my game.");
        
        
    }
}