package ex10;

import javax.swing.*;
import java.awt.event.*;

public class MoveCar2 extends JFrame {
    int img_x = 150, img_y = 150;
    JButton button;
    public MoveCar2 () {
        setSize(900,600);
        button = new JButton("");
        ImageIcon icon = new ImageIcon("C:\\Test\\car2.png");

        button.setIcon(icon);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        button.setLocation(img_x,img_y);
        button.setSize(94,94);
        panel.add(button);
        panel.requestFocus();
        panel.setFocusable(true);
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {
                img_x = e.getX();
                img_y = e.getY();
                button.setLocation(img_x,img_y);
            }
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MoveCar2 f = new MoveCar2 ();
    }
}
