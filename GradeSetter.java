import java.util.Scanner;
public class GradeSetter {
    
    public static void main(String[] args) {
        
    Scanner scd = new Scanner(System.in);
    Scanner sc_string = new Scanner(System.in);
    
    
    System.out.print("Please enter your first name: ");
    String first = sc_string.nextLine();
    System.out.print("Please enter your last name: ");
    String last = sc_string.nextLine();
    System.out.print("Please enter the grade you earned on your last AP exam: ");
    double grade = scd.nextDouble();
    
    //vars
    String sp = (" ");
    double zero = 0;
    double fty = 50;
    double sty = 60;
    double svty = 70;
    double ety = 80;
    double nty = 90;
    double hdr = 100;
    
    // F - Fail
    if (grade >= zero && grade <= fty) {
        System.out.println("Well, " + first + sp + last + " based on your grade of a " + grade + ":");
        System.out.println("Your grade is a F - Fail" + "\n" + "You need to repeat this course");
    }
    
    // E - Conditional Pass
    else if (grade > fty && grade <= sty) {
        System.out.println("Well, " + first + sp + last + " based on your grade of a " + grade + ":");
        System.out.println("Your grade is E - Conditional Pass" + "\n" + "You are at risk of failing, may need to repeat!");        
    }
    
    // D - Pass
    else if (grade > sty && grade <= svty) {
        System.out.println("Well, " + first + sp + last + " based on your grade of a " + grade + ":");
        System.out.println("Your grade is D - Pass" + "\n" + "Minimal performance achieved!");        
    }
    
    // C - Good Grade
    else if (grade > svty && grade <= ety) {
        System.out.println("Well, " + first + sp + last + " based on your grade of a " + grade + ":");
        System.out.println("Your grade is C - Good" + "\n" + "Average and Good Performance!");        
    }
    
    // B - Very Good Grade
    else if (grade > ety && grade <= nty) {
        System.out.println("Well, " + first + sp + last + " based on your grade of a " + grade + ":");
        System.out.println("Your grade is B - Very Good" + "\n" + "VERY Good Performance!");        
    }    
    // A - Awesome
    else if (grade > nty && grade <= hdr) {
        System.out.println("Well, " + first + sp + last + " based on your grade of a " + grade + ":");
        System.out.println("Your grade is A - Awesome" + "\n" + "EXCELLENT PERFORMANCE!");        
    }    
    
    System.out.println("Thank you for running my Grade Performance Program");
    System.out.println("Have a great Day!!");
    
    
    
    
    }
    
}