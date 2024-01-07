package ex10.exercise;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex08 extends JFrame {
    int imgx =150 , imgy = 10;

    public Ex08(){
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
        panel.addMouseListener(new MouseAdapter() {
               @Override
               public void mousePressed(MouseEvent e) {
                   imgx = e.getX();
                   label.setLocation(imgx, imgy);
               }
        });
        setVisible(true);
        panel.requestFocusInWindow();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex08();
    }
}
