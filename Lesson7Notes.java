import java.util.Scanner;
public class Lesson7Notes {
    
    public static void main(String[] args){
        
        Scanner scs = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        int x = sci.nextInt(); // 7
        int y = sci.nextInt(); // 9
        int z = sci.nextInt(); // 2
        
        System.out.println("x/y == " + (x/y)); // 0
        System.out.println("x%z == " + (x%z));
        System.out.println("y/z == " + (y/z));
        System.out.println("y%z == " + (y%z));
        System.out.println("z%y == " + (z%y));
        
        if (x%2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }
        
        System.out.println("Please any amount of change: ");
        double a = sci.nextDouble();
        
        int b = (int)(a / .25);
        System.out.println(b);
        
        
    }
    
}