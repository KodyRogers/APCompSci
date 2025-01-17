import java.util.Scanner;
public class Lesson5b {
    
    public static void main(String[] args) {
        Lesson5b lesson5 = new Lesson5b();
        
        Scanner sc_int = new Scanner(System.in);
        
        System.out.print("Please enter 4 integers: ");
        int a = sc_int.nextInt();
        int b = sc_int.nextInt();
        int c = sc_int.nextInt();
        int d = sc_int.nextInt();
        
        int f = lesson5.add(a, b, c, d);
        System.out.println("The sum of the numbers is " + f);
    
    }
    public int add(int a, int b, int c, int d) {
        
        int e = a + b + c + d;
        
        return e;
        
    }
}