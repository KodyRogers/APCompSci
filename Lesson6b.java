import java.util.Scanner;
public class Lesson6b {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a decimal number: ");
        double a = sc.nextDouble();

        int x = (int)a;
        System.out.println("Anwser " + x);
    }
    
} 