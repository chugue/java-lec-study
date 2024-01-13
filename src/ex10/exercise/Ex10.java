package ex10.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Ex10 extends JFrame {
    int guess = (int)(Math.random()*100);
    public Ex10() {
        setTitle("Ex10");
        setSize(600, 150);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        //center Panel
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setPreferredSize(new Dimension(300, 200));

        JLabel label1 = new JLabel("숫자를 추측하시오 : ");
        JTextField field = new JTextField(15);
        JLabel label2 = new JLabel("힌트", SwingConstants.CENTER);
        JButton button1 = new JButton("새 게임");
        JButton button2 = new JButton("종료");

        label1.setPreferredSize(new Dimension(120, 20));
        label2.setPreferredSize(new Dimension(250, 20));

        panel.add(label1);
        panel.add(field);
        panel.add(label2);
        panel.add(button1);
        panel.add(button2);
        button1.addActionListener(e -> {
            field.setText("");
            label2.setText("힌트");
            this.guess = (int)(Math.random() * 100);
        });
        button2.addActionListener(e -> {
            this.dispose();
        });
            field.addActionListener(e -> {
                int num = Integer.parseInt(field.getText());
                if (num < guess) {
                    label2.setText("너무 낮습니다.");
                    label2.setBackground(Color.yellow);
                    label2.setOpaque(true);
                    field.setText("");
                }
                if (num > guess) {
                    label2.setText("너무 높습니다.");
                    label2.setBackground(Color.RED);
                    label2.setOpaque(true);
                    field.setText("");
                }
                if (num == guess) {
                    label2.setText("정답입니다.");
                    label2.setBackground(Color.green);
                    label2.setOpaque(true);
                }
            });
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex10();
    }
}
