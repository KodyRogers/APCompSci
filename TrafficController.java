import java.util.Scanner;

public class TrafficController {
    
    public static void main(String[] args) {
        
        Scanner sc_str = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);
        
        System.out.print("Please enter the driver's name: ");
        String name1 = sc_str.nextLine();
        System.out.print("Please enter " + name1 + "'s speed: ");
        int spd1 = sc_int.nextInt();
        
        System.out.println(" ");
        
        System.out.print("Please enter the second driver's name: ");
        String name2 = sc_str.nextLine();
        System.out.print("Please enter the second" + name2 + "'s speed: ");
        int spd2 = sc_int.nextInt();
        
        String sp = " ";
        
        if (spd1 == 0 && spd2 > 0) {
            System.out.println(name2 + " May proceed first!");
        }
        
        else if (spd1 > 0 && spd2 == 0) {
            System.out.println(name1 + " May proceed first!");
        }
        
        else if (spd1 > 0 && spd2 > 0) {
            System.out.println("You both must wait 60 seconds");
            for (int i = 1; i <= 60; i++) {
            System.out.println(i);
        }
        System.out.println("You both may now proceed!");
        
        }
        
        else if (spd1 == 0 && spd2 == 0) {
            System.out.println("You Both may now proceed!");
        }
    
    }    
}