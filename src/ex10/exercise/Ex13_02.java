package ex10.exercise;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex13_02 extends JFrame {
    private static int totalNum = 8;
    private static String a;

    private List<String> generateNum (int count){
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= totalNum; i++) {
            list.add(String.valueOf(i));
        }
        list.add(" ");
        Collections.shuffle(list);
        return list;
    }

    public Ex13_02() {
        setTitle("Ex13");
        setSize(350,350);
        setLayout(new BorderLayout());
        List<String> shuffle = generateNum(totalNum);

        //center panel
        JPanel center = new JPanel(new GridLayout(3,3,2,2));
        JButton button1 = new JButton(String.valueOf(shuffle.get(0)));
//        JButton button2 = new JButton(String.valueOf(shuffle.get(1)));
        JButton button3 = new JButton(String.valueOf(shuffle.get(2)));
        JButton button4 = new JButton(String.valueOf(shuffle.get(3)));
        JButton button5 = new JButton(String.valueOf(shuffle.get(4)));
        JButton button6 = new JButton(String.valueOf(shuffle.get(5)));
        JButton button7 = new JButton(String.valueOf(shuffle.get(6)));
        JButton button8 = new JButton(String.valueOf(shuffle.get(7)));
        JButton button9 = new JButton(String.valueOf(shuffle.get(8)));
        JButton button2 = new JButton(" ");
        center.add(button1);
        center.add(button2);
        center.add(button3);
        center.add(button4);
        center.add(button5);
        center.add(button6);
        center.add(button7);
        center.add(button8);
        center.add(button9);

        //south panel
        JPanel south = new JPanel(new BorderLayout(5,5));
        south.setPreferredSize(new Dimension(200,40));
        JButton resetButton = new JButton("reset");
        resetButton.setFont(new Font("Arial", Font.BOLD, 15));
        resetButton.setBackground(Color.GREEN);
        resetButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        south.add(resetButton, BorderLayout.CENTER);
        button1.addActionListener(e -> {
            if (button2.getText().equals(" ")) {
                a = button1.getText();
                button2.setText(a);
                button1.setText(button4.getText());
            }
        });






        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Ex13_02();
    }
}

