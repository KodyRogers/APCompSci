import java.util.*;
public class IfTester2 {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        Scanner sci = new Scanner(System.in);    
            
        System.out.println("Please enter an integer.");
        int a = sci.nextInt();
        
        if (a == 7) {
            System.out.println("Your number is seven.");
        }
        else if (a != 2) {
            System.out.println("Your number is not equal to two ");
        }
        
        System.out.println("Collect a magic word.");
        String b = sc.nextLine();
        
        if (b.equals("please")){
            System.out.println("Thou shall pass.");
        } else {
            System.out.println("Shall not pass");
        }
    }
    
}