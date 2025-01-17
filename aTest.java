import java.util.Scanner;
public class aTest {
    
    public static void main(String[] args) {
        aTest at = new aTest();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        int h = at.randomproblem(a, b, c, d, e);
        System.out.println("You're wrong");
        
    }
    public int randomproblem(int a, int b, int c, int d, int e) {
        
        int f = (2*a + c);
        int h = (b + d - e);
        if (f != h) {
            
            int z = 1;
            
        } else {
            
            int y = 0;
            
        }
        
        return 1;
        
    }
}