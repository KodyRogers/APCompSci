import java.util.Scanner;
public class Lesson5a {
    
    public static void main(String[] args) {
        Lesson5a lesson5 = new Lesson5a();
        
        Scanner sc_db = new Scanner(System.in);
        
        // collect the data
        System.out.print("Enter two real numbers: ");
        double a = sc_db.nextDouble();
        double b = sc_db.nextDouble();
        
        //call my method
        double answer = lesson5.subtract(a, b);
        System.out.println("The difference between " + b + " and " 
                            + a + " is " + answer);
        
    } // end of main
    
    
    public double subtract(double a, double b) {
        
        double c = b - a;
        
        return c;
        
    }
    
}