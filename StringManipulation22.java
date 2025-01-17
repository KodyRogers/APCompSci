import java.util.*;
public class StringManipulation22 {
    
    public static void main (String[] args) {
        
        Scanner sci = new Scanner(System.in);
        
        System.out.println("Please enter a string.");
        String a = sci.nextLine();
        System.out.println("Enter a letter to checked.");
        String b = sci.nextLine();
        System.out.println("Enter a letter to replace.");
        String c = sci.nextLine();
        
        String d = changeChar(a, b, c);
        System.out.println(d);
        
    }
    public static String changeChar(String a, String b, String c) {
        
        int w1 = a.indexOf(b);
        if (w1 == -1) {
            return a;
        } else {
            
            String w2 = a.substring(0, w1);
            w2 += c;
            w2 += a.substring(w1 + 1);
            
            return w2;
        }
    }   
}