package tp4;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Container;

public class BoxLayoutHorizontalExample extends JFrame {
    private Box bHor;
    private JButton b1, b2;
    
    
    public BoxLayoutHorizontalExample() {
        this.setTitle("BoxLayout Horizontal");
        this.setSize(550, 100);
        Container contenu = this.getContentPane();
        
        bHor = Box.createHorizontalBox();
        contenu.add(bHor);
        
        b1 = new JButton("Bouton1");
        bHor.add(b1);
        
 
        
        b2 = new JButton("Bouton2");
        bHor.add(b2);
    }
    
    public static void main(String[] args) {
        new BoxLayoutHorizontalExample().setVisible(true);
    }
}