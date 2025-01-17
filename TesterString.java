import java.util.*;
public class TesterString {
    
    public static void main(String[] args) {
        
        Scanner sci = new Scanner(System.in);
        
        System.out.println("Please enter a word");
        String a = sci.nextLine();
        
        int b = a.length();
        System.out.println(b);
        
        char c = a.charAt(1);
        
        if (b > 1) {
            
            System.out.println(c);
            
        }
        
        String ac = a.toUpperCase();
        System.out.println(ac);
        
        System.out.println(a.toLowerCase());
        
        if (b > 5) {
            
            String d = a.substring(1, 4);
            System.out.println(d);
            
            
        }
        
        for (int i = 0; i < b; i++) {
            System.out.println(a.charAt(i));
                
            System.out.printl("\t");
        
        }
        
        
    }
    
}