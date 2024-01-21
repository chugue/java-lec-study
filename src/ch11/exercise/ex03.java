package ch11.exercise;

import javax.swing.*;
import java.awt.*;

public class ex03 extends JFrame {

    public ex03() {
        setTitle("ex03");
        setSize(550, 200);
        setLayout(new BorderLayout());

        JPanel north = new JPanel();
        north.setPreferredSize(new Dimension(200,20));

        JPanel west = new JPanel(new FlowLayout(FlowLayout.RIGHT,10,10));
        west.setPreferredSize(new Dimension(150,100));
        JLabel label1 = new JLabel("찾기 대화 상자");
        west.add(label1);

        JPanel center = new JPanel(new FlowLayout(FlowLayout.LEFT));
        center.setPreferredSize(new Dimension(200,50));
        JPanel centerPanel1 = new JPanel();
        JPanel centerPanel2 = new JPanel(new GridLayout(2,2,10,10));
        JTextField text = new JTextField(25);
        JCheckBox checkBox1 = new JCheckBox("대소문자 구별하기");
        JCheckBox checkBox2 = new JCheckBox("반복");
        JCheckBox checkBox3 = new JCheckBox("전체 단어 매치");
        JCheckBox checkBox4 = new JCheckBox("역순으로");
        centerPanel2.add(checkBox1);
        centerPanel2.add(checkBox2);
        centerPanel2.add(checkBox3);
        centerPanel2.add(checkBox4);
        centerPanel1.add(text);
        center.add(centerPanel1);
        center.add(centerPanel2);

        JPanel east = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
        east.setPreferredSize(new Dimension(100,50));
        JButton button1 = new JButton("찾기");
        JButton button2 = new JButton("취소");
        button1.setPreferredSize(new Dimension(80,30));
        button2.setPreferredSize(new Dimension(80,30));
        east.add(button1);
        east.add(button2);

        add(north, BorderLayout.NORTH);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
        add(east, BorderLayout.EAST);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ex03();
    }
}
