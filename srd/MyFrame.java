package srd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener, MouseListener, MouseMotionListener {

    JLabel label;
    int mouseX, mouseY; // To store the mouse's initial position

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(350, 250, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);

        this.addKeyListener(this);
        label.addMouseListener(this);
        label.addMouseMotionListener(this); // Add motion listener to the label

        this.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Store the initial mouse position relative to the label
        mouseX = e.getX();
        mouseY = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Calculate the new position of the label
        int newX = label.getX() + e.getX() - mouseX;
        int newY = label.getY() + e.getY() - mouseY;
        label.setLocation(newX, newY);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Required method, no implementation needed for now
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) { // Check if it's a double-click
            label.setLocation((this.getWidth() - label.getWidth()) / 2, (this.getHeight() - label.getHeight()) / 2);
            System.out.println("Label reset to center");
        } else {
            label.setText("click");
            System.out.println("click");
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Required method, no implementation needed for now
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Required method, no implementation needed for now
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Required method, no implementation needed for now
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> label.setLocation(label.getX(), label.getY() - 10);
            case KeyEvent.VK_DOWN -> label.setLocation(label.getX(), label.getY() + 10);
            case KeyEvent.VK_LEFT -> label.setLocation(label.getX() - 10, label.getY());
            case KeyEvent.VK_RIGHT -> label.setLocation(label.getX() + 10, label.getY());
            case KeyEvent.VK_R -> label.setBackground(Color.red);
            case KeyEvent.VK_G -> label.setBackground(Color.green);
            case KeyEvent.VK_B -> label.setBackground(Color.blue);
            case KeyEvent.VK_Y -> label.setBackground(Color.yellow);
            case KeyEvent.VK_SPACE -> label.setLocation((int) (Math.random() * 800), (int) (Math.random() * 600));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Required method, no implementation needed for now
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Required method, no implementation needed for now
    }
}

