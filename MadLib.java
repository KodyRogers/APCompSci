import java.util.Scanner;

public class MadLib {

    public static void main(String[] args) {
        
        Scanner sc_string = new Scanner(System.in);

        // Welcome
        System.out.println("Welcome to the game of Mad Lib.");
        System.out.println("I will ask you to provide various words");
        System.out.println("and phrases to fill in a story.");
        System.out.println("The result will be written printed out in your terminal.");
        System.out.println(" ");
        System.out.println(" ");
        
        
        // Occupation
        System.out.print("Please write an Occupation ");
        String job = sc_string.nextLine();
        
        // Noun1
        System.out.print("Please write a Noun ");
        String nn1 = sc_string.nextLine();
        
        // Verb1
        System.out.print("Please write a Verb ");
        String vb1 = sc_string.nextLine();
        
        // Adjective 1
        System.out.print("Please write an Adjective ");
        String adj1 = sc_string.nextLine();
        
        // Noun2
        System.out.print("Please write a Noun ");
        String nn2 = sc_string.nextLine();
        
        // Verb2
        System.out.print("Please write a Verb ");
        String vb2 = sc_string.nextLine();
        
        // Adjective 2
        System.out.print("Please write an Adjective ");
        String adj2 = sc_string.nextLine();
        
        // Noun3
        System.out.print("Please write a Noun ");
        String nn3 = sc_string.nextLine();
        
        // Verb3
        System.out.print("Please write a Verb ");
        String vb3 = sc_string.nextLine();
        
        // Noun4
        System.out.print("Please write a Noun ");
        String nn4 = sc_string.nextLine();


        // Done
        System.out.println("Your mad-lib has been created!");
        System.out.println(" ");
        System.out.println(" ");

        // MadLib
        System.out.print("Today a " + job + " named " + nn1 + " came to our school to talk to us about his job. He" + "\n" + "said the most important skill you need to know to do his job is to be able to \"" + vb1 + "\" around "   + "\n" + "a " + adj1 + " " + nn2 + ". He said it was easy for him to learn his job because he loved to" + "\n" + vb1 + " when he was my age and that helps a lot! If you're considering his profession, I" + "\n" + "hope you can be near a " + adj2 + " " + nn3 + ". That's very important! If you get too" + "\n" + "distracted in that situation you won't be able to " + vb3 + " next to a " + nn4 + "!");
        
    

    }

}