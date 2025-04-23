package tp4;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.GridLayout;

public class GridLayoutExample extends JFrame {
    public static int NBOUTONS = 6;
    private JButton boutons[];
    
    public GridLayoutExample() {
        this.setTitle("Exemple GridLayout");
        this.setSize(350, 180);
        Container contenu = this.getContentPane();
        contenu.setLayout(new GridLayout(2, 3, 6, 4));
        
        boutons = new JButton[NBOUTONS];
        for (int i = 0; i < NBOUTONS; i++) {
            boutons[i] = new JButton("Bin " + (i + 1));
            contenu.add(boutons[i]);
        }
    }
    
    public static void main(String[] args) {
        new GridLayoutExample().setVisible(true);
    }
}
