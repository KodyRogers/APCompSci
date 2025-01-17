import java.awt.*;
import javax.swing.*;
public class ConCat {
    public static void createWindow() {
    JFrame frame = new JFrame("Sample GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel jlabel = new JLabel("I'm text", SwingConstants.CENTER);
    jlabel.setPreferredSize(new Dimension(300, 100));
    frame.getContentPane().add(jlabel, BorderLayout.CENTER);
    
    frame.setLocationRelativeTo(null);
    frame.pack();
    frame.setVisible(true);
    }
    public static void main(String[] args) {
        createWindow();
    }
}