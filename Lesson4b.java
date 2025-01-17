import java.util.Scanner;
public class Lesson4b {
    
    public static void main(String[] args) {
        
        Scanner str = new Scanner(System.in);
        Scanner itn = new Scanner(System.in);
        
        System.out.println("Hi there. What is your name?");
        String a = str.nextLine();
        
        System.out.println("Hi " + a + ". How old are you?");
        int b = itn.nextInt();
        
        int c = 100 - b;
        
        System.out.println(a + ", you will be 100 in " + c + " years.");
        
    }
    
}