import java.util.*;
public class Lesson7a {
    
    public static void main(String[] args) {
        
        Scanner sci = new Scanner(System.in);
        
        System.out.println("Please enter a three digit number");
        int a = sci.nextInt();
        
        int b = (a%10);
        int c = ((a%100)/10);
        int d = ((a%1000)/100);
        System.out.println("Here are the digits: \n" + d + "\n" + c + "\n" + b);
    }
    
}