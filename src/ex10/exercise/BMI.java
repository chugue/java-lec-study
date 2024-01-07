package ex10.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI extends JFrame {

    public BMI() {
        setTitle("BMI 변환기");
        setSize(550, 250);
        setLayout(new BorderLayout());

        add(panels());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JPanel panels() {
        JPanel panel = new JPanel(new BorderLayout());
        //왼쪽공간
        JPanel west = new JPanel();
        west.setPreferredSize(new Dimension(30,50));
        panel.add(west, BorderLayout.WEST);
        //오른쪽공간
        JPanel east = new JPanel();
        east.setPreferredSize(new Dimension(100,50));
        panel.add(east, BorderLayout.EAST);
        //중간패널
        JPanel middlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT,20,15));
        JLabel label = new JLabel("나의 BMI 지수는 얼마나 될까?");
        label.setPreferredSize(new Dimension(300,20));

        JLabel label1 = new JLabel("나의 체중(kg) : ", SwingConstants.LEFT);
        label1.setPreferredSize(new Dimension(120,20));
        JLabel label2 = new JLabel("나의 키(cm) : ", SwingConstants.LEFT);
        label2.setPreferredSize(new Dimension(120,20));
        JLabel label3 = new JLabel("결과 : ", SwingConstants.LEFT);
        label3.setPreferredSize(new Dimension(120,20));

        JTextField text1 = new JTextField(20);
        text1.setPreferredSize(new Dimension(400,20));
        JTextField text2 = new JTextField(20);
        text2.setPreferredSize(new Dimension(400,20));
        JTextField text3 = new JTextField(20);
        text2.setPreferredSize(new Dimension(400,20));

        JButton button = new JButton("BMI 확인하기");
        button.setPreferredSize(new Dimension(200,20));

        middlePanel.add(label);
        middlePanel.add(label1);
        middlePanel.add(text1);
        middlePanel.add(label2);
        middlePanel.add(text2);
        middlePanel.add(label3);
        middlePanel.add(text3);
        middlePanel.add(button);

        panel.add(middlePanel, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int weight = Integer.parseInt(text1.getText());
                double height = Double.parseDouble(text1.getText())/100;
                double result = weight/(height*height);
                text3.setText(String.valueOf(result));
            }
        });

        return panel;
    }

    public static void main(String[] args) {
        BMI j = new BMI();

    }
}
