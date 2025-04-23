package ecran;

import java.awt.*;
import javax.swing.*;

public class Ecran extends JFrame {
    JPanel[] panels = new JPanel[3];
    String[] colors = {"#FF0000", "#0000FF", "#00FF00"}; // Hex colors for red, blue, green
    JButton[] buttons = new JButton[3];
    JLabel[] labels = new JLabel[3];
    String[] texts = {"accueil", "parametres", "infos"}; 

    public Ecran() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(null); // Using null layout for manual positioning

        for (int i = 0; i < 3; i++) {
            labels[i] = new JLabel(texts[i]);
            labels[i].setBounds(350, 250, 300, 300);
            labels[i].setFont(new Font("Arial", Font.BOLD, 50)); // Set font to Arial, bold, size 24
            
            
            // Create panels
            panels[i] = new JPanel();
            panels[i].setBounds(0, 0, 800, 500);
            panels[i].setBackground(Color.decode(colors[i]));
            panels[i].setVisible(i == 0); // Only show the first panel initially
            panels[i].add(labels[i]); // Add label to the panel
            this.add(panels[i]);

            // Create buttons
            buttons[i] = new JButton("Ecran " + (i + 1));
            buttons[i].setBounds(20 + (250 * i), 520, 100, 30);
            buttons[i].setBackground(Color.decode(colors[i]));

            // Add action listener to switch panels
            int finalI = i; // Required for lambda expression
            buttons[i].addActionListener(e -> {
                // Hide all panels
                for (JPanel panel : panels) {
                    panel.setVisible(false);
                }
                // Show the selected panel
                panels[finalI].setVisible(true);
            });

            this.add(buttons[i]);
        }

        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ecran()); // Properly start Swing on EDT
    }
}