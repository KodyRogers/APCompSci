import java.util.Scanner;

public class Func3Tester {
    
    public static void main(String[] args) {
        
        Scanner sc_str = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);
        
        Func3 f = new Func3();
        
        System.out.print("Please print a interger: ");
        int num1 = sc_int.nextInt();
        
        System.out.print("Please enter another interger: ");
        int num2 = sc_int.nextInt();
        
        System.out.print("Please enter some text: ");
        String text = sc_str.nextLine();
        
    f.abc(num1, num2, text);
    
    int fatterwhale = f.xyz(num1, num2);
    System.out.println("The sum is: " + fatterwhale);    
        
    int whale = f.yeet(num1, num2);
    System.out.println("The product is: " + whale);
    
    String lolxD = f.lol(text);
    System.out.println("My pizza String is: " + lolxD);
    }
    
    
    
}