import java.util.Scanner;

public class Func2Tester {
    
    public static void main(String[] args) {
        
        Func2 f = new Func2();
        
        Scanner sc_str = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);
        
        System.out.print("Please enter a word: ");
        String text = sc_str.nextLine();
        
        System.out.print("Please enter a keyword: ");
        String word = sc_str.nextLine()
        
        boolean isFound = f.b(text, word);
        
        if (isFound == true) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
        //System.out.println("You had entered " + text1);
        
        
        
        
        
    }
    
    
}