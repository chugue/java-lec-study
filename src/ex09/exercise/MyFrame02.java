package ex09.exercise;

import javax.swing.*;
import java.awt.*;

public class MyFrame02 extends JFrame {
    public MyFrame02() {
        setTitle("2번 문제");
        setSize(500, 150);
        setLayout(new FlowLayout(FlowLayout.CENTER,5,5));

        JLabel label = new JLabel("카운터 값 ");
        add(label);

        JTextField text = new JTextField(10);
        add(text);
        text.setText("0");

        JButton button = new JButton("증가");
        add(button);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MyFrame02 f = new MyFrame02();
    }
}
