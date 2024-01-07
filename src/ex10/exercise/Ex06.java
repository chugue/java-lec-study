package ex10.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex06 extends JFrame {
    int pos_x = 200;
    int pos_y = 0;

    public Ex06 () {
        setTitle("Ex06");
        setLayout(new BorderLayout());
        setSize(600,200);
        //센터 패널
        JPanel center = new JPanel(new BorderLayout());
        center.setLayout(null);
        ImageIcon icon = new ImageIcon("C:\\Test\\car2.png");
        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setBounds(pos_x,pos_y,100,100);
        center.add(label, BorderLayout.CENTER);


        //남쪽 패널
        JPanel south = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        south.add(left);
        south.add(right);

        add(center,BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);

        left.addActionListener(e -> {pos_x -= 10; label.setLocation(pos_x, pos_y);});
        right.addActionListener(e -> {pos_x += 10; label.setLocation(pos_x, pos_y);});

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex06();
    }
}
