import java.util.Scanner;
public class Lesson6a {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        double x = (a + b)/(double)2;
        System.out.println("The average is " + x);
    }
    
} 