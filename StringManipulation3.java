import java.util.*;
public class StringManipulation3 {
    
    public static void main (String[] args) {
        
        Scanner sci = new Scanner(System.in);
        
        System.out.println("Please enter a few words");
        String a = sci.nextLine();
        
        String d = first(a);
        String lst = last(a);
        int wc = countWhiteSpace(a);
        System.out.println(d);
        System.out.println(lst);
        System.out.println(wc);
    }
    public static String first(String a) {
        
        int ws = a.indexOf(" ");
        String b = a.substring(0, ws);
        String c = b.toUpperCase();
        return c;
    }
    public static String last(String a) {
        
        int length = a.length();
        int wsa = a.lastIndexOf(" ");
        String e = a.substring(wsa + 1, length);
        String f = e.toUpperCase();
        return f;
    }
    public static int countWhiteSpace(String a) {
        
        int b = 0;
        while (a.indexOf(" ") != -1) {
            
            int wsaa = a.indexOf(" ");
            String word = a.substring(wsaa + 1);
            b ++;
            a = word;
            
        }
        return b;
    }
    
}