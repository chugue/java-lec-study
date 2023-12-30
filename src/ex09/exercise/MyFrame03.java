package ex09.exercise;

import javax.swing.*;
import java.awt.*;

public class MyFrame03 extends JFrame {
    public MyFrame03() {
        setTitle("3번 문제");
        setLayout(new FlowLayout(FlowLayout.CENTER,5,15));
        setSize(400, 150);
        setLocation(300,300);

        JLabel label = new JLabel("   자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.   ");
        add(label);

        JButton button1 = new JButton("1일");
        JButton button2 = new JButton("2일");
        JButton button3 = new JButton("3일");
        JButton button4 = new JButton("4일");
        JButton button5 = new JButton("5일");
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MyFrame03 f = new MyFrame03();
    }
}
