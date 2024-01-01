package ex10;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MoveCar extends JFrame {
    int img_x=150, img_y=150;
    JButton button;

    public MoveCar() {
        setSize(600, 300);
        button = new JButton("");
        ImageIcon icon = new ImageIcon("c:\\car.png");

        button.setIcon(icon);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        button.setLocation(img_x,img_y);
        button.setSize(200,100);
        panel.add(button);
        panel.requestFocus();
        panel.setFocusable(true);
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch(keyCode){
                    case KeyEvent.VK_UP: img_y -= 10; break;
                    case KeyEvent.VK_DOWN: img_y += 10; break;
                    case KeyEvent.VK_LEFT:  img_x -= 10; break;
                    case KeyEvent.VK_RIGHT:  img_x += 10; break;
                }
                button.setLocation(img_x, img_y);
            }
            @Override
            public void keyReleased(KeyEvent e) {}
        });
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MoveCar f = new MoveCar();
    }
}
