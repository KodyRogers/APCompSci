import java.util.*;
public class crackthecode {
    
    public static void main (String[] args) {
        
        Scanner sci = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        
        System.out.println("Hello user, what is your name.");
        String a = scs.nextLine();
        
        System.out.println("Hello, " + a + " Try your best to crack the code.");
        
        String b = "t";
        
        System.out.println();
        System.out.println("Phase 1 \nEnter a number.");
        int c = scs.nextInt();
        
        while(b.equalsIgnoreCase("t")) {
            
            if (c == 3) {
                
                System.out.println("Correct \n\nPhase 2 \nEnter a number.");
                int d = sci.nextInt();
                
                    if (d == 1 || (d >= 33 && d <= 100)) {
                
                        System.out.println("Correct \n\nPhase3 \nEnter a number.");
                        int e = sci.nextInt();
                        
                            int f = e%3;
                            int g = e%7;
                            if (f == 0 || g == 0) {
                                
                                System.out.println("Correct \n\nYou have cracked the code!");
                                b = "f";
                            } else {
                                
                                System.out.println("Sorry, that was incorrect! \nBetter luck next time!");
                                b = "f";
                                
                            }
                            
                        
                    } else { 
                        
                        System.out.println("Sorry, that was incorrect! \nBetter luck next time!");
                        b = "f";
                        
                    }    
            } else {
                
                System.out.println("Sorry, that was incorrect! \nBetter luck next time!");
                b = "f";
                
            } 
            
        }

    }
    
}