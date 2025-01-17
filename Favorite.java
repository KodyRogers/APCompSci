import java.util.Scanner;

public class Favorite {
    
    public static void main(String[] args) {
        
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);
        
        
        // Favorite Number
        System.out.print("What is your favorite number? ");
        int number = sc_int.nextInt();
        System.out.println("Your favorite number is " + number);
        
        
        // Favorite Sport
        System.out.print("What is your favorite sport? ");
        String sport = sc_string.nextLine();
        System.out.println("Your favorite sport is " + sport);
        
        
        // Favorite VideoGame
        System.out.print("What is your favorite VideoGame? ");
        String favVG = sc_string.nextLine();
        System.out.println("My favorite VideoGame is " + favVG);
        
        
        // Favorite Food
        System.out.print("What is your favorite food? ");
        String favFood = sc_string.nextLine();
        System.out.println("My favorite food is " + favFood);
        
        
        // Favorite Subject
        System.out.print("What is your favorite Subject in school? ");
        String subject = sc_string.nextLine();
        System.out.println("Your favorite Subject is " + subject);
        
        
        // Favorite TV Show
        System.out.print("What is your favorite TV Show? ");
        String tvShowFav = sc_string.nextLine();
        System.out.println("Your favorite TV Show is " + tvShowFav);
        
        
        // Favorite Car
        System.out.print("What is your favorite Car? ");
        String carFav = sc_string.nextLine();
        System.out.println("Your favorite car is " + carFav);
        
        
        // Favorite State
        System.out.print("What is your favorite State? ");
        String state = sc_string.nextLine();
        System.out.println("Your favorite State is " + state);
        
        
        // Favorite Pet
        System.out.print("What is your favorite Pet? ");
        String petFav = sc_string.nextLine();
        System.out.println("Your favorite Pet is " + petFav);
        
        
        // Favorite Color
        System.out.print("What is your favorite Color? ");
        String colour = sc_string.nextLine();
        System.out.println("Your favorite color is " + colour);
        
        
        
        
    }
}