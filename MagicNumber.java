import java.util.Scanner;

public class MagicNumber {

    public static void main(String[] args) {
        
        Scanner sc_int = new Scanner(System.in);
        String sp = " ";
        
        System.out.println("Welcome to my Magic Number Program!");
        System.out.println(sp);
        
        System.out.print("Enter any three integers to guess my magic number: ");
        int num1 = sc_int.nextInt();
        int num2 = sc_int.nextInt();
        int num3 = sc_int.nextInt();
        System.out.println(sp);
        
        // Magic number is 13
        
        
        if (num1 == 13 || num2 == 13 || num3 == 13) {
            
            System.out.println(" OH MY GOSH, YOU ENTERED THE MAGIC NUMBER \n YOU JUST WON A MILLION DOLLARS!!!!!");
        
            
        } else {
            
            System.out.println("I am sorry you did not enter the magic number.");
            System.out.println(sp);
            System.out.println("!-- you are a loser --!");
            
        }
            
        System.out.println(sp);
        System.out.println("Thank you for running my Magic Number Program.");
        System.out.println(sp);
        System.out.println("Have a great day!");
        
        
        
    }
    
    
}    