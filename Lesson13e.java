import java.util.*;
public class Lesson13e {
    
    public static void main (String[] args) {
        
        int a = (int)(Math.random() * 12) + 1;
        int b = (int)(Math.random() * 9) + 3;
        
        Scanner sc = new Scanner(System.in);
        System.out.println(a + " * " + b);
        System.out.println("Please enter a the anwser");
        int x = sc.nextInt();
        
        int c = (a * b);
        if (x == c) {
           System.out.println("Correct");
        } else {
           System.out.println("Wrong");
        }

    }
    
}