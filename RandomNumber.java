import java.util.*;
public class RandomNumber {
    
    public static void main(String[] args) {
     
        //a random int between 0 and 10, include and not 10
        int x = (int)(Math.random() * 10) + 1;
        System.out.println(x);
        
        int y = (int)(Math.random() * 25) - 10;
        System.out.println(y);
    }
    
}