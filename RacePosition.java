import java.util.*;
public class RacePosition {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("This program will compute the place percentages"
        + " of the race runners and show their results.");
        System.out.print("Do you want to run the program (yes or no): ");
        String a = sc.nextLine();
        
        Double b = 0.0; //b holds winning time
        if (a.equalsIgnoreCase("yes")) {
            System.out.print("\nPlease enter the winning race time (min/sec): ");
            b = sc.nextDouble();
        } else {
            System.exit(0);
        }
        
        sc.nextLine();
        
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;
        int total = 0;
        
        while (a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("y")) {
            total++;
            System.out.print("Runner Number " + total + ": What is the runner's race time: ");
            double rt = sc.nextDouble();
            while (rt < b) {
                System.out.print("Please enter a time greater then the winning time.");
                rt = sc.nextDouble();
            }
            sc.nextLine();
            
            if (inGroup1(b, rt) == true) {
                c1++;
            }
            else if (inGroup2(b, rt) == true) {
                c2++;
            }
            else if (inGroup3(b, rt) == true) {
                c3++;
            }
            else if (inGroup4(b, rt) == true) {
                c4++;
            }
            else if (inGroup5(b, rt) == true) {
                c5++;
            }
            else if (inGroupLoser(b, rt) == true) {
                c6++;
            }
            
            System.out.print("Do you want to add another runner (yes/y or no/n): ");
            a = sc.nextLine();
            
            
        }
        System.out.println("");
        
        double perc1 = (double)c1/(double)total * 100;
        double perc2 = (double)c2/(double)total * 100;
        double perc3 = (double)c3/(double)total * 100;
        double perc4 = (double)c4/(double)total * 100;
        double perc5 = (double)c5/(double)total * 100;
        double perc6 = (double)c6/(double)total * 100;
        
        System.out.println("The percentage of runners in the first place group is: " + perc1 + "%");
        System.out.println("The percentage of runners in the second place group is: " + perc2 + "%");
        System.out.println("The percentage of runners in the third place group is: " + perc3 + "%");
        System.out.println("The percentage of runners in the fourth place group is: " + perc4 + "%");
        System.out.println("The percentage of runners in the fifth place group is: " + perc5 + "%");
        System.out.println("The percentage of runners in the last place group is: " + perc6 + "%");
    }
    // 1st place group is a time within 10% over the winning time.
    public static boolean inGroup1(double b, double rt) {
        
        double o10 = 1.1 * b;
        if (rt <= o10 && rt > b) {
            return true;
        } 
        return false;
        

    }
    public static boolean inGroup2(double b, double rt) {
        double o20 = 1.2 * b;
        double o10 = 1.1 * b;
        if (o10 < rt && rt <= o20) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean inGroup3(double b, double rt) {
        double o30 = 1.3 * b;
        double o20 = 1.2 * b;
        if (o20 < rt && rt <= o30) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean inGroup4(double b, double rt) {
        double o30 = 1.3 * b;
        double o40 = 1.4 * b;
        if (o30 < rt && rt <= o40) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean inGroup5(double b, double rt) {
        double o50 = 1.5 * b;
        double o40 = 1.4 * b;
        if (o40 < rt && rt <= o50) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean inGroupLoser(double b, double rt) {
        double o50 = 1.5 * b;
        if (rt > o50) {
            return true;
        } else {
            return false;
        }
    }
}