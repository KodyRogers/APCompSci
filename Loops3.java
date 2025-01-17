import java.util.*;
public class Loops3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        
        System.out.println("Would you like to guess my random number between 1 and 10 (y or n)");    
        String a = sc.nextLine();
        
        while (a.equalsIgnoreCase("Yes") || a.equalsIgnoreCase("y")) {
            
            int b = (int)(Math.random() * 10) + 1;
            
            System.out.println("Guess my random number 1 to 10");
            int c = sci.nextInt();
            
            if (c == b) {
                
                System.out.println("You win");
                a = "No";
            } else {
                
                System.out.println("The random number was " + b);
                System.out.println("You are wrong, would you like to try again");
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