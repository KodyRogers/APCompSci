import java.util.*;
public class StringManipulation2 {
    
    public static void main (String[] args) {
        
        Scanner sci = new Scanner(System.in);
        
        System.out.println("Please enter a string.");
        String a = sci.nextLine();
        System.out.println("Enter a letter to checked.");
        String b = sci.nextLine();
        
        boolean tst = test(a, b);
        
        if (tst == true) {
            System.out.println(a + " is true");
        } 
        else if (tst == false) {
            System.out.println(a + " is false");   
        } else {
        }
        
    }
    public static boolean test(String a, String b) {
        
        int w1 = a.indexOf(b);
        int w2 = a.indexOf(b, (w1 + 1));
        if (w1 != -1 && w2 != -1) {
            return true;
        } else {
            return false;
        }
    }
    
}