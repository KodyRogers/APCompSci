import java.util.*;
public class MiddleWord {
    
    public static void main (String[] args) {
        
        Scanner sci = new Scanner(System.in);
        
        System.out.println("Please enter 3 words");
        String a = sci.nextLine();
        
        String test = method(a);
        
        System.out.println("This is the middle word " + test);
    }
    public static String method(String a) {
        
        int ws = a.indexOf(" ");
        String word_sub = a.substring(ws + 1);
        
        int wsa = word_sub.indexOf(" ");
        String test = word_sub.substring(0, wsa);
        
        return test;
    }
}