package tp4;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FenetreSansPanel extends JFrame {
    private JButton bouton = new JButton("Mon bouton");
    
    public FenetreSansPanel() {
        this.setTitle("Bouton");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(bouton);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new FenetreSansPanel();
    }
}