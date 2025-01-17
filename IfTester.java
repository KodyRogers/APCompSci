import java.util.Scanner;

public class IfTester {
    
    public static void main(String[] args) {
        
        Scanner sc_int = new Scanner(System.in);
        
        System.out.print("Enter a grade: ");
        int grade = sc_int.nextInt();
        
        System.out.print("Enter your next grade: ");
        int grade2 = sc_int.nextInt();
        
        
        if (grade > grade2) {
            System.out.println(grade + " is your highest!");
        
            
        } else {
            
            System.out.println(grade2 + " is your highest!");
        
            
        }
        
        if (grade * grade2 < 1000) {
            System.out.println("get a job!");
            
            
        } else {
            
            System.out.println("wow you are really smart");
            
        }
        
        if (grade + grade2 == 2 && grade * grade2 == 1) {
            System.out.println("get to class, you are a bum");
            
        } else {
            
            System.out.println("probaby should still get to class");
            
        }
        
        if (grade == 100 || grade2 == 100) {
            System.out.println("You Rock");
        }
    
        
    }
    
}