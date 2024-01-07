package ex10.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex04 extends JFrame {
    public Ex04 (){
        setTitle("Mile - Km");
        setSize(500,200);
        setLayout(new FlowLayout(10));

        JLabel label1 = new JLabel("마일을 입력하시오 ");
        JTextField t1 = new JTextField(10);
        JLabel label2 = new JLabel(">");
        JTextField t2 = new JTextField(10);
        JButton button = new JButton("변환");

        add(label1);
        add(t1);
        add(label2);
        add(t2);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mile = Integer.parseInt(t1.getText());
                double km = mile * 1.60934;
                t2.setText(String.valueOf(km));
            }
        });
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex04();
    }
}
