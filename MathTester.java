import java.util.Scanner;
public class MathTester {
    
    public static void main(String[] args) {
    
        Scanner sc_int = new Scanner(System.in);
    
        //System.out.print("Please enter two numbers: ");
        //int a = sc_int.nextInt();
        //int b = sc_int.nextInt();
        
        MathFunctions mf = new MathFunctions();
        
        for (int i = 0; i < 10; i++){
            mf.chief();
            //System.out.println("end of line ");
        }
    
    
    }
}