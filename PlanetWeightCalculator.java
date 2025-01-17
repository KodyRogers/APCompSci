import java.util.*;
public class PlanetWeightCalculator {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String a = "Yes";
        int n = 0;
        while (a.equalsIgnoreCase("Yes")) {
            
            System.out.print("What is your weight on Earth? ");
            int b = sc.nextInt();
            
            System.out.println("");
            System.out.print("1. Voltar \n2. Krypton \n3. Fertos \n4. Servontos");
            System.out.print("\nSelections number? ");
            int c = sc.nextInt();
            sc.nextLine();
            
            double answer = PlanetWeightCalculator.db(b, c);
            
            if (c == 1) {
                System.out.println("Your weight on Voltar would be " + answer);
            }    
            else if (c == 2) {
                System.out.println("Your weight on Krypton would be " + answer);
            }
            else if (c == 3) {
                System.out.println("Your weight on Fertos would be " + answer);
            } 
            else if (c == 4) {
                System.out.println("Your weight on Servontos would be " + answer);
            } 
            
            System.out.print("\nWould you like to play again? (Yes/No)");
            String t = sc.nextLine();
            n++;
            if (t.equalsIgnoreCase("Yes") || t.equalsIgnoreCase("y")) {
                a = "Yes";
            } else {
                a = "no";
            }
        }
        System.out.println("You ran this " + n + " times.");
    }
    public static double db(int b, int c){
        double d = 0.0;
        if (c == 1) {
           d = (double)b * 0.091;
        }
        else if (c == 2) {
            d = (double)b * 0.720;
        }
        else if (c == 3) {
            d = (double)b * 0.865;
        }
        else if (c == 4) {
            d = (double)c * 4.612; 
        }
        return d;
    }
}