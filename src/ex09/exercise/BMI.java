package ex09.exercise;

import javax.swing.*;
import java.awt.*;

public class BMI extends JFrame {

    public BMI() {
        setTitle("BMI 변환기");
        setSize(600, 300);
        setLayout(new BorderLayout());

        add(panels());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JPanel panels() {
        JPanel panel = new JPanel(new BorderLayout());
        //상부 패널
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 20,20));
            JLabel label1 = new JLabel("나의 BMI 지수는 얼마나 될까?");
            panel1.add(label1);

            panel.add(panel1, BorderLayout.NORTH);
        //중부 패널
        JPanel middlePanel = new JPanel(new GridLayout(2,3,20, 10));
            JLabel label2 = new JLabel("나의 체중(kg) : ", SwingConstants.LEFT);
            JTextField text1 = new JTextField(20);
            JLabel label3 = new JLabel("나의 키(m) : ", SwingConstants.LEFT);
            JTextField text2 = new JTextField(20);
                middlePanel.add(label2);
                middlePanel.add(text1);
                middlePanel.add(text2);
                middlePanel.add(label3);
                middlePanel.add(text2);


            panel.add(middlePanel, BorderLayout.CENTER);

        //하부 패널
        JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT, 20,20));
            JButton button = new JButton("BMI 확인하기");
            panel4.add(button);
            panel.add(panel4, BorderLayout.SOUTH);

        return panel;
    }

    public static void main(String[] args) {
        BMI j = new BMI();

    }
}
