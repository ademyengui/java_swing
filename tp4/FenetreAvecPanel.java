package tp4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreAvecPanel extends JFrame {
    private JPanel pan = new JPanel();
    private JButton bouton = new JButton("Mon bouton");
    
    public FenetreAvecPanel() {
        this.setTitle("Animation");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        pan.add(bouton);
        this.setContentPane(pan);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new FenetreAvecPanel();
    }
}