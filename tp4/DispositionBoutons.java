package tp4;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

public class DispositionBoutons extends JFrame {
    public DispositionBoutons() {
        this.setTitle("Disposition des boutons");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contenu = this.getContentPane();
        contenu.setLayout(new BorderLayout());
        
        
        Box boxHorizontale = Box.createHorizontalBox();
        boxHorizontale.add(new JButton("Bouton 1"));
        boxHorizontale.add(Box.createHorizontalStrut(10));
        boxHorizontale.add(new JButton("Bouton 2"));
        boxHorizontale.add(Box.createHorizontalStrut(10));
        boxHorizontale.add(new JButton("Bouton 3"));
        contenu.add(boxHorizontale, BorderLayout.NORTH);
        
        JPanel gridPanel = new JPanel(new GridLayout(2, 3, 5, 5));
        for (int i = 1; i <= 6; i++) {
            gridPanel.add(new JButton("Bin " + i));
        }
        contenu.add(gridPanel, BorderLayout.CENTER);
        
        
        Box boxVerticale = Box.createVerticalBox();
        boxVerticale.add(new JButton("Premier"));
        boxVerticale.add(Box.createVerticalStrut(10));
        boxVerticale.add(new JButton("Deuxième"));
        boxVerticale.add(Box.createVerticalStrut(10));
        boxVerticale.add(new JButton("Troisième"));
        contenu.add(boxVerticale, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        new DispositionBoutons().setVisible(true);
    }
}