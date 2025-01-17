import java.util.*;
public class Lesson24 {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Lesson24.one();
        Lesson24.two();
        
        System.out.println("Please enter a number");
        int a = sc.nextInt();
        Lesson24.three(a);
        
    }
    public static void one() {
        
            for (int i = 23; i <= 89; i++) {
                if (i == 33 || i == 43 || i == 53 || i == 63 || i == 73 || i == 83) {
                    System.out.print("\n");
                }
                System.out.print(i + " ");                
            }
            
    }
    public static void two() {
        
        System.out.print("\n");
        for (int b = 1; b <= 50; b++) {
        b++;
        System.out.println(b);
        }
        System.out.print("\n");
    }
    public static void three(int a) {
        int b = 0;
        for (int i = a; i <= 100; i++) {
            System.out.print(i + " ");
            b++;
            if (b == 20){
                System.out.print("\n");
                b = 0;
            }
            
        }
    }
}