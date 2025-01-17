import java.util.*;
public class StringManipulation {
    
    public static void main(String[] args) {
        
        Scanner scs = new Scanner(System.in);
        
        System.out.println("Please enter one word: ");
        String word = scs.nextLine();
        
        int wn = word.length(); 
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        
        System.out.println("You have " + wn + " letters in it");
        System.out.println("First letter is: " + first);
        System.out.println("last letter is " + last);
        
        System.out.println("Please several more words: ");
        String words = scs.nextLine();
        
        int ws = words.indexOf(" ");
        System.out.println("The second word starts at index: " + (ws + 1));
        
        String word_sub = words.substring(ws + 1);
        System.out.println("The words without the first is " + word_sub);
        
        // substring(start_index)
        // Start index is an integer
        // substring returns all the characteres from the start_index 
        // to the end fo the string
        
        // substring(start_index, end_index)
        // start_index and end_index are integers
        // substring returns all the characteres from the start_index 
        // up until the end_index - 1
        
        String temp = "bP killed Johnstown in BO4";
        String temp2 = temp.substring(ws, ws + 8);
        String temp3 = temp.substring(23, 24);
        System.out.println(temp2);
        
        
    }
    
}