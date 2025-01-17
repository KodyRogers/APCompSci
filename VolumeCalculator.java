import java.util.Scanner;

public class VolumeCalculator {
    
    public static void main(String[] args) {
        
        Scanner scd = new Scanner(System.in);
        String s = " ";
        
        // Cylinder volume
        System.out.print("Enter the Radius of your cylinder: ");
        double cyl_r = scd.nextDouble();
        System.out.print("Enter the Height of your cylinder: ");
        double cyl_h = scd.nextDouble();
        
        double cyl_vol = Math.PI * cyl_r * cyl_r * cyl_h;
        
        System.out.println("The volume of your cylinder is " + cyl_vol);
        System.out.println();
        
        
        
        // Cone Volume
        System.out.print("Enter the Radius of your cone: ");
        double co_r = scd.nextDouble();
        System.out.print("Enter the Height of your cone: ");
        double co_h = scd.nextDouble();
        
        double co_vol = (1/3.0) * Math.PI * cyl_r * cyl_r * cyl_h;
        
        System.out.println("The volume of your cone is " + co_vol);
        System.out.println();
        
        // Cube volume
        System.out.print("Enter a Side of your cube: ");
        double cs = scd.nextDouble();
        
        double cv = cs * cs * cs;
        
        System.out.println("The volume of your cube is " + cv);
        System.out.println();
        
        // Rectangular Prism Volume
        System.out.print("Enter the length of your Prism: ");
        double rp_l = scd.nextDouble();
        System.out.print("Enter the width of your Prism: ");
        double rp_w = scd.nextDouble();
        System.out.print("Enter the height of your Prism: ");
        double rp_h = scd.nextDouble();
        
        double rp_vol = rp_h * rp_l * rp_w;
        
        System.out.println("The volume of your Rectangular Prism is " + rp_vol);
        System.out.println();
        
        // Pyramid
        System.out.print("Enter the base of the Pryamid: ");
        double p_b = scd.nextDouble();
        System.out.print("Enter the Height of the Pryamid: ");
        double p_h = scd.nextDouble();
        
        double p_v = (1/3.0) * p_b * p_h;
        
        System.out.println("The volume of your Pyramid is " + p_v);
        System.out.println();
        
        // Sphere
        System.out.print("Enter the radius of your sphere: ");
        double sp_r = scd.nextDouble();
        
        double sp_v = (4/3.0) * Math.PI * sp_r * sp_r * sp_r;
        
        System.out.println("The volume of your sphere is " + sp_v);
        System.out.println();
        
        // ellipsoid
        System.out.print("Enter the first radius of your ellipsoid: ");
        double e_r1 = scd.nextDouble();
        System.out.print("Enter the second radius of your ellipsoid: ");
        double e_r2 = scd.nextDouble();
        System.out.print("Enter the thrid radius of your ellipsoid: ");
        double e_r3 = scd.nextDouble();  
        
        double e_v = (4/3.0) * Math.PI * e_r1 * e_r2 * e_r3;
        
        System.out.println("Your volume of your ellipsoid is " + e_v);
        System.out.println();
        
        
    }
    
}