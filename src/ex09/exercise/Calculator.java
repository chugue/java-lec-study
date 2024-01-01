package ex09.exercise;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public JButton[] buttons;
    public String[] labels = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
                              "*", "0", "#", "send", " ", "end"};

    public Calculator (){
        setTitle("Calculator");
        setSize(500,180);
        setLayout(new BorderLayout());

        add(northPanel(), BorderLayout.NORTH);
        add(eastPanel(), BorderLayout.EAST);
        add(centerPanel(), BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public JTextField northPanel(){
        JTextField text = new JTextField();
        return text;
    }
    public JButton eastPanel(){
        JButton clear = new JButton("Clear");
        clear.setPreferredSize(new Dimension(100,100));

        return clear;
    }
    public JPanel centerPanel() {
        JPanel cal = new JPanel(new GridLayout(5,3));
        buttons = new JButton[15];
        for (int i = 0; i < 15; i++) {
            buttons[i] = new JButton(labels[i]);
            cal.add(buttons[i]);
        }
        return cal;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
