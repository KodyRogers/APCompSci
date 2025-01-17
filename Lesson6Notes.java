public class Lesson6Notes {
    
    public static void main(String[] args) {
        
        //Simple
        int x = -4; 
        int y = 4;
        System.out.println("Sum is " + (x + y));
        
        y++;
        System.out.println("y is " + y);
        System.out.println("y is " + (++y) );
        System.out.println("y is " + (y++) );
        System.out.println("y is " + (y) ); 
        
        System.out.println("y is " + (--y) );
        
        
        // this is called type casting
        int z = 13;
        //z = z / 2;
        double a = (double)z / 2;
        System.out.println("z is " + z);
        System.out.println("z is " + a);
        
        // is this legal
        // int zz = 67.7; // No
        int zz = (int)67.7; // Yes
        System.out.println("zz == " + zz);
        
        // to score a single character
        char g = 'a';
        System.out.println("g == " + g);
        char d = (char)37;
        System.out.println(d);
    }
    
}