import java.util.Scanner;
public class MovieRatings {
    
    public static void main(String[] args) {
    MovieRatings MR = new MovieRatings();
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter ratings from the movie review website. ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    System.out.println("Please enter ratings from the focus group. ");
    double d = sc.nextDouble();
    double e = sc.nextDouble();
    
    System.out.println("Please enter the average movie critic rating. ");
    double f = sc.nextDouble();
    
    System.out.println(" ");
    
    double g = MR.intaverage(a, b, c);
    System.out.println("Average website rating: " + g);
    
    double h = MR.dbaverage(d, e);
    System.out.println("Average focus group rating: " + h);
    System.out.println("Average movie critic rating: " + f);
    
    double i = MR.overall(g, h, f);
    System.out.println("Overall movie rating: " + i);
        
    }
    
    public double intaverage(int a, int b, int c) {
        
        double j = (a + b + c)/(double)3;
        return j;
        
    }
    
    public double dbaverage(double d, double e) {
        
        double k = (d + e)/2;
        return k;
        
    }
    public double overall(double g, double h, double f) {
        
        double l = (g * .2) + (h * .3) + (f * .5);
        return l;
    }
}