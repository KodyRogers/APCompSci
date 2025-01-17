import java.util.Scanner;

public class ForLoopFun {
    
    public static void main(String[] args) {
    
    Scanner sc_int = new Scanner(System.in);
    
    System.out.print("Please enter your starting integer: ");
    int start = sc_int.nextInt();
    System.out.print("Please enter your counting integer: ");
    int count = sc_int.nextInt();
    System.out.print("Please enter your ending integer: ");
    int end = sc_int.nextInt();        
        
    int total = 0;    
        
        for (int i = start; i <= end; i+= count) {
        System.out.println(i);    
        total += i;     
        }
        System.out.println("the sum of your loop is " + total);
        
    }
}