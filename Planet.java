import java.util.*;
public class Planet {
    
    public static void main(String[] args) {
        
        Scanner sc_int = new Scanner(System.in);
        Scanner sc_str = new Scanner(System.in);
        
        System.out.print("What is your weight on Earth? ");
        double a = sc_int.nextDouble();
        
        //List
        System.out.println("\n1. Voltar \n2. Krypton \n3. Fertos \n4. Servontos \n");
        
        //planets
        double b = 0.091;
        double c = 0.720;
        double d = 0.865;
        double e = 4.612;
        
        //Selection
        System.out.print("Selection? ");
        double f = sc_int.nextDouble(); 
        
        //
        if (f == 1) {
        System.out.println("Your weight on Voltar would be " + a * b);
        } 
        else if(f == 2) {
        System.out.println("Your weight on Krypton would be " + a * c);    
        }
        else if(f == 3) {
        System.out.println("Your weight on Fertos would be " + a * d);
        }
        else if(f == 4) {
        System.out.println("Your weight on Servontos would be " + a * e);    
        }
        
    }

}