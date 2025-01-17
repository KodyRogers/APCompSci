import java.util.Scanner;
public class Lesson3b {
    
    public static void main(String[] args) {
    
    Scanner sc_str = new Scanner(System.in);
    
    String d = " ";
    
    System.out.print("Please enter three names: ");
    String a = sc_str.nextLine();
    String b = sc_str.nextLine();
    String c = sc_str.nextLine();
    
    System.out.println(c + d + b + d + a);
    }
}