package ex10.exercise;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex07 extends JFrame {
    int imgx = 150, imgy = 50;

    public Ex07 (){
        setTitle("Moving Car");
        setSize(500,200);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        ImageIcon icon = new ImageIcon("C:\\Test\\car2.png");
        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setBounds(imgx,imgy,150,150);
        panel.add(label);

        add(panel);
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                switch (keycode){
                    case KeyEvent.VK_LEFT -> {imgx -= 10;break;}
                    case KeyEvent.VK_RIGHT -> {imgx += 10; break;}
                }
                label.setLocation(imgx,imgy);
            }
        });
        setVisible(true);
        panel.requestFocusInWindow();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex07();
    }
}
