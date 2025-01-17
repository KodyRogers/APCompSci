import java.util.*;
public class LoopWhile {
    
    public static void main(String[] args) {
        
        Scanner str = new Scanner(System.in);
        Scanner sint = new Scanner(System.in);
        
        System.out.print("Do you want to try and guess my secret number: ");    
        String a = str.nextLine();
        
        while (a.equalsIgnoreCase("Yes") || a.equalsIgnoreCase("y")) {
            
            int b = 32;
            
            System.out.println("Guess my secret number");
            int c = sint.nextInt();
            
            if (c == b) {
                
                a = "No";
            } else {
                
                System.out.println("You are wrong please try again");
            }
        }
        
        System.out.println("Thanks for playing my game!");
        
    }
}