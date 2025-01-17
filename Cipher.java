import java.util.Scanner;
public class Cipher {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a word:");
        String a = sc.nextLine();
        
        System.out.println("Do you want to encode or decode the text:");
        String b = sc.nextLine();
        
        if (b.equals("decode")) {
            
            System.out.println("placeholderdecode");
        } 
        else if (b.equals("encode")) {
            
            
            
        }
        else {
            
            System.out.println("Error");
            System.exit(0);
            
        }
    }
    
}