import java.util.Scanner;
public class Lesson5c {
    
    public static void main(String[] args) {
        Lesson5c lesson5 = new Lesson5c();
        
        Scanner db = new Scanner(System.in);
        
        System.out.println("Please entre a radius:");
        double r = db.nextDouble();
        
        double pi = 3.14;
        
        double d = lesson5.circumference(r, pi);
        double e = lesson5.area(r, pi);
        System.out.println("Circumference: " + d);
        System.out.println("Area: " + e);
        
    }
    
    public double circumference(double r, double pi) {
        
        double b = 2 * pi * r;
        return b;
        
    }
    public double area(double r, double pi) {
        
        double c = pi * r * r;
        return c;
        
    }
}