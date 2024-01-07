package ex10.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex05 extends JFrame {
    public Ex05(){
        setTitle("이자계싼기");
        setLayout(new BorderLayout());
        setSize(600,120);
        //북쪽 패널
        JPanel north = new JPanel();
        JLabel label1 = new JLabel("원금을 입력하시오");
        JLabel label2 = new JLabel("이자율을 입력하시오");
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JButton button = new JButton("변환");

        north.add(label1);
        north.add(t1);
        north.add(label2);
        north.add(t2);
        north.add(button);

        //센터 패널
        JPanel center = new JPanel();
        JTextField message = new JTextField(20);
        center.add(message);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int amount = Integer.parseInt(t1.getText());
                double rate = Double.parseDouble(t2.getText());
                int interest = (int)(amount * (rate/100));
                message.setText(String.valueOf(interest));
            }
        });
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Ex05();
    }
}
