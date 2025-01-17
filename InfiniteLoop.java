public class InfiniteLoop {
    
    public static void main(String[] args) {
        
        int billy = 1;
        while (billy <= billy++) {
            
            System.out.print(billy);
            billy++;
        }
        
    }
    
}