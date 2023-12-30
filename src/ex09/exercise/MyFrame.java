package ex09.exercise;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(400,150);
        setLocation(300, 300);
        setTitle("My Frame");
        setLayout(new FlowLayout());

        JLabel label = new JLabel("자바는 재미있나요?");
        add(label);
        JButton button1 = new JButton("Yes");
        JButton button2 = new JButton("No");
        add(button1);
        add(button2);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }

}
