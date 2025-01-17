import java.util.Scanner;
public class Lesson3c {
    
    public static void main(String[] args) {
        
        Scanner sc_str = new Scanner(System.in);
        
        System.out.print("Hello there. What is your name? ");
        String a = sc_str.nextLine();
        System.out.print("What adjective describes you? ");
        String b = sc_str.nextLine();
        
        
        String c = "My name is ";
        String d = ". ";
        String e = "I am ";
        
        System.out.println(c + a + d + e + b + d);
        
        
    }
    
}