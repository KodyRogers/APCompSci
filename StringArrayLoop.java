import java.util.*;
public class StringArrayLoop {
    
    public static void main (String[] args) {
        
        StringArrayLoop sal = new StringArrayLoop();
        
        Scanner scs = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        
        System.out.println("Please enter a word");
        String a = scs.nextLine();
        System.out.println("Please enter an int");
        int b = sci.nextInt();
        
        RussianFruit(a, b);
    } // end of main method

    
    public static void RussianFruit(String donkey, int b) {
        
        
        for (int i = 0; i < donkey.length(); i++) {
            for (int p = 0; p < b; p++){    
            System.out.print(donkey.charAt(i));
            }
        }
        
        System.out.println();
    }
} // end of program