package ex10.exercise;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex13 extends JFrame {
    private static int totalNum = 8;
    private static String a;

    private List<String> generateNum(int count) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= totalNum; i++) {
            list.add(String.valueOf(i));
        }
        list.add(" ");
        Collections.shuffle(list);
        return list;
    }

    public Ex13() {
        setTitle("Ex13");
        setSize(350, 350);
        setLayout(new BorderLayout());
        List<String> shuffle = generateNum(totalNum);

        //center panel
        JPanel center = new JPanel(new GridLayout(3, 3, 2, 2));
        JButton button1 = new JButton(String.valueOf(shuffle.get(0)));
        JButton button2 = new JButton(String.valueOf(shuffle.get(1)));
        JButton button3 = new JButton(String.valueOf(shuffle.get(2)));
        JButton button4 = new JButton(String.valueOf(shuffle.get(3)));
        JButton button5 = new JButton(String.valueOf(shuffle.get(4)));
        JButton button6 = new JButton(String.valueOf(shuffle.get(5)));
        JButton button7 = new JButton(String.valueOf(shuffle.get(6)));
        JButton button8 = new JButton(String.valueOf(shuffle.get(7)));
        JButton button9 = new JButton(String.valueOf(shuffle.get(8)));
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
        JPanel south = new JPanel(new BorderLayout(5, 5));
        south.setPreferredSize(new Dimension(200, 40));
        JButton resetButton = new JButton("reset");
        resetButton.setFont(new Font("Arial", Font.BOLD, 15));
        resetButton.setBackground(Color.GREEN);
        resetButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        south.add(resetButton, BorderLayout.CENTER);
        button1.addActionListener(e -> {
            if (button2.getText().equals(" ")) {
                a = button1.getText();
                button2.setText(a);
                button1.setText(" ");
            }
            if (button4.getText().equals(" ")) {
                a = button1.getText();
                button4.setText(a);
                button1.setText(" ");
            }
        });
        button2.addActionListener(e -> {
            if (button1.getText().equals(" ")) {
                a = button2.getText();
                button1.setText(a);
                button2.setText(" ");
            }
            if (button3.getText().equals(" ")) {
                a = button2.getText();
                button3.setText(a);
                button2.setText(" ");
            }
            if (button5.getText().equals(" ")) {
                a = button2.getText();
                button5.setText(a);
                button2.setText(" ");
            }
        });
        button3.addActionListener(e -> {
            if (button2.getText().equals(" ")) {
                a = button3.getText();
                button2.setText(a);
                button3.setText(" ");
            }
            if (button6.getText().equals(" ")) {
                a = button3.getText();
                button6.setText(a);
                button3.setText(" ");
            }
        });
        button4.addActionListener(e -> {
            if (button1.getText().equals(" ")) {
                a = button4.getText();
                button1.setText(a);
                button4.setText(" ");
            }
            if (button5.getText().equals(" ")) {
                a = button4.getText();
                button5.setText(a);
                button4.setText(" ");
            }
            if (button7.getText().equals(" ")) {
                a = button4.getText();
                button7.setText(a);
                button4.setText(" ");
            }
        });
        button5.addActionListener(e -> {
            if (button2.getText().equals(" ")) {
                a = button5.getText();
                button2.setText(a);
                button5.setText(" ");
            }
            if (button4.getText().equals(" ")) {
                a = button5.getText();
                button4.setText(a);
                button5.setText(" ");
            }
            if (button6.getText().equals(" ")) {
                a = button5.getText();
                button6.setText(a);
                button5.setText(" ");
            }
            if (button8.getText().equals(" ")) {
                a = button5.getText();
                button8.setText(a);
                button5.setText(" ");
            }
        });
        button6.addActionListener(e -> {
            if (button3.getText().equals(" ")) {
                a = button6.getText();
                button3.setText(a);
                button6.setText(" ");
            }
            if (button5.getText().equals(" ")) {
                a = button6.getText();
                button5.setText(a);
                button6.setText(" ");
            }
            if (button9.getText().equals(" ")) {
                a = button6.getText();
                button9.setText(a);
                button6.setText(" ");
            }
        });
        button7.addActionListener(e -> {
            if (button4.getText().equals(" ")) {
                a = button7.getText();
                button4.setText(a);
                button7.setText(" ");
            }
            if (button8.getText().equals(" ")) {
                a = button7.getText();
                button8.setText(a);
                button7.setText(" ");
            }
        });
        button8.addActionListener(e -> {
            if (button5.getText().equals(" ")) {
                a = button8.getText();
                button5.setText(a);
                button8.setText(" ");
            }
            if (button7.getText().equals(" ")) {
                a = button8.getText();
                button7.setText(a);
                button8.setText(" ");
            }
            if (button9.getText().equals(" ")) {
                a = button8.getText();
                button9.setText(a);
                button8.setText(" ");
            }
        });
        button9.addActionListener(e -> {
            if (button6.getText().equals(" ")) {
                a = button9.getText();
                button6.setText(a);
                button9.setText(" ");
            }
            if (button8.getText().equals(" ")) {
                a = button9.getText();
                button8.setText(a);
                button9.setText(" ");
            }
        });
        resetButton.addActionListener(e -> {
            Collections.shuffle(shuffle);
            button1.setText(shuffle.get(0));
            button2.setText(shuffle.get(1));
            button3.setText(shuffle.get(2));
            button4.setText(shuffle.get(3));
            button5.setText(shuffle.get(4));
            button6.setText(shuffle.get(5));
            button7.setText(shuffle.get(6));
            button8.setText(shuffle.get(7));
            button9.setText(shuffle.get(8));
        });

        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Ex13();
    }
}

