import java.util.Scanner;
public class Lesson6c {
    
    public static void main(String[] args) {
        
        Lesson6c lesson6 = new Lesson6c();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a decimal number: ");
        double a = sc.nextDouble();
        
        double c = a * 100;
        int d = (int)c;
        int x = (int)a * 100;
        System.out.println("Anwser: " + (d - x));
    } 
    
} 