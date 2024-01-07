package ex10.exercise;

import javax.swing.*;
import java.awt.*;

public class Ex02 extends JFrame {
    public Ex02() {
        setTitle("Ex02");
        setSize(600,300);
        setLayout(new BorderLayout());

        add(west(), BorderLayout.WEST);
        add(north(), BorderLayout.NORTH);
        add(center(), BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public JPanel west () {
        JPanel panel1 = new JPanel(new FlowLayout());
        JLabel label1 = new JLabel("첫 번째 정수 :", SwingConstants.RIGHT);
        JLabel label2 = new JLabel("두 번째 정수 :", SwingConstants.RIGHT);
        JLabel label3 = new JLabel("연산의 결과 :", SwingConstants.RIGHT);


        label1.setPreferredSize(new Dimension(150,20));
        label2.setPreferredSize(new Dimension(150,20));
        label3.setPreferredSize(new Dimension(150,20));
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        return panel1;
    }

    public JPanel center () {
        JPanel panel2 = new JPanel(new FlowLayout());
        JTextField t1 = new JTextField(20);
        JTextField t2 = new JTextField(20);
        JTextField t3 = new JTextField(20);

        JButton button1 = new JButton("Add");
        JButton button2 = new JButton("Clear");

        t1.setPreferredSize(new Dimension(200,20));
        t2.setPreferredSize(new Dimension(200,20));
        t3.setPreferredSize(new Dimension(200,20));
        button1.setPreferredSize(new Dimension(100,20));
        button2.setPreferredSize(new Dimension(100,20));

        panel2.add(t1);
        panel2.add(t2);
        panel2.add(t3);

        panel2.add(button1);
        panel2.add(button2);

        return panel2;
    }
    public JPanel north (){
        JPanel panel3 = new JPanel();
        panel3.setSize(200,20);

        return panel3;
    }


    public static void main(String[] args) {
        new Ex02();

    }
}
