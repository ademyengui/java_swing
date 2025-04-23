package tp4;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;

public class BoxLayoutVerticalExample extends JFrame {
    private Box bVert;
    private JButton b1, b2, b3;
    
    public BoxLayoutVerticalExample() {
        this.setTitle("BoxLayout Vertical");
        this.setSize(150, 200);
        Container contenu = this.getContentPane();
        
        bVert = Box.createVerticalBox();
        contenu.add(bVert);
        
        b1 = new JButton("Premier");
        bVert.add(b1);
        
        bVert.add(Box.createVerticalStrut(10));
        
        b2 = new JButton("Deuxième");
        bVert.add(b2);
        
        bVert.add(Box.createGlue());
        
        b3 = new JButton("Troisième");
        bVert.add(b3);
    }
    
    public static void main(String[] args) {
        new BoxLayoutVerticalExample().setVisible(true);
    }
}
