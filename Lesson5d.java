import java.util.Scanner;
public class Lesson5d{
    
    public static void main (String[] args) {
        Lesson5d lesson5 = new Lesson5d();
        
        Scanner db = new Scanner(System.in);
        
        System.out.println("Enter a price: ");
        double a = db.nextDouble();
        
        double c = lesson5.change(a);
        System.out.println("Change from $20: $" + c);
        
    }
    public double change(double a) {
        
        double b = 20 - a;
        return b;
        
    }
}