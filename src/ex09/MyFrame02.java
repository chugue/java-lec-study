package ex09;

import javax.swing.*;
import java.awt.*;

public class MyFrame02 extends JFrame {
    JButton b1, b2, b3;
    Container cPane;
    CardLayout layoutm;

    public MyFrame02(){
        setTitle("BorderLayoutTest");
        setSize(300, 150);
        cPane = getContentPane();
        layoutm = new CardLayout();
        setLayout(layoutm);

        JButton b1 = new JButton("Card #1");
        JButton b2 = new JButton("Card #2");
        JButton b3 = new JButton("Card #3");

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(e -> layoutm.next(cPane));
        b2.addActionListener(e -> layoutm.next(cPane));
        b3.addActionListener(e -> layoutm.next(cPane));

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MyFrame02 f = new MyFrame02();

    }
}
