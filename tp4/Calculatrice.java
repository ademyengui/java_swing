// Removed package declaration to avoid issues with non-project files
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculatrice extends JFrame {
    public Calculatrice() {
        this.setTitle("Calculatrice");
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        Container contenu = this.getContentPane();
        contenu.setLayout(new BorderLayout());
        
        
        JTextField ecran = new JTextField("0");
        ecran.setHorizontalAlignment(JTextField.RIGHT);
        contenu.add(ecran, BorderLayout.NORTH);
        
        
        JPanel panelBoutons = new JPanel(new GridLayout(5, 4, 5, 5));
        
        
        String[] boutons = {
            "C", "±", "%", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "", "="
        };
        

    for (String text : boutons) {
        JButton button = new JButton(text);
        final String btnText = text; 

        button.addActionListener(e -> {
            switch (btnText) {
                case "C" -> ecran.setText("0");
                case "=" -> ecran.setText(String.valueOf(operationHandling(ecran.getText())));
                case "" -> {} 
                default -> {
                    if (ecran.getText().equals("0")) {
                        ecran.setText(btnText);
                    } else {
                        ecran.setText(ecran.getText() + btnText);
                    }
                }
            }
    });

    panelBoutons.add(button);
}

        contenu.add(panelBoutons, BorderLayout.CENTER);
    }

    public static float operationHandling(String operation) {
        
        String[] parts = operation.split("[+\\-*/]");
        if (parts.length != 2) return 0; 
    
        float num1 = Float.parseFloat(parts[0]);
        float num2 = Float.parseFloat(parts[1]);
    
        char operator = ' ';
    
        
        for (char ch : operation.toCharArray()) {
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operator = ch;
                break;
            }
        }
    
        float result = 0;
    
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division par zéro !");
                }
            }
            default -> System.out.println("Opérateur inconnu !");
        }
    
        return result;
    }
    
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        calc.setVisible(true);
    }
}
