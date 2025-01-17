import java.util.Scanner;
public class ChangeMaker {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the cost of the product");
        double cp = sc.nextDouble();
        
        System.out.println("Please enter how much you paid");
        double p = sc.nextDouble();
        
        double a = cp*100;
        double b = p*100;
        int c = (int)(b-a);
        int qs = (c);
        int ds = (qs%25);
        int ns = (ds%10);
        int ps = (ns%5);
        
        int eq = (int)qs/25;
        int ed = ds/10;
        int en = ns/5;
        System.out.println("debug " + qs + " " + ds + " " + ns + " " + ps);
        System.out.println(eq + " Quarters\n" + ed + " Dimes\n" + en + " Nickles\n" + ps + " Pennies");
        
    }
    
}