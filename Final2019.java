import java.util.*;
public class Final2019 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        /**String b = ("Who in the world would want to be a programmer and be rich?");
        String part = b.substring(7,18);
        System.out.println("part == \n" + part);
        /// Question one anwser = the world w
        
        int x = 55, y = 10;
        int z = x / y;
        System.out.println("z == " + z);**/
        // z == 5;
        
        //Problem 3a
        String loop = "a";
        int zero = 1;
        while (loop.equalsIgnoreCase("a")) {
            
            System.out.println(zero);
            if (zero >= 10) {
                loop = "b";
            } else {
                zero++;
            }
            
        }
        
        System.out.print("Please enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
        math(a, b);
        
    }
    public static void math(int a, int b) {
        
        int math = (a*b);
        System.out.println("The product is " + math);
    }
    
}