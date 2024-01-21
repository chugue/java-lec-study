package ch11.exercise;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ex02 extends JFrame {
    public ArrayList<Integer> list = new ArrayList<Integer>();
    double average = 0;
    double result = 0;

    public ex02() {
        setTitle("ex02");
        setSize(500, 200);
        setLayout(new BorderLayout());

        JPanel west = new JPanel();
        west.setPreferredSize(new Dimension(80, 100));
        JPanel center = new JPanel();
        JPanel east = new JPanel();
        east.setPreferredSize(new Dimension(80, 100));

        JPanel firstRow = new JPanel(new BorderLayout(0, 100));
        JLabel label1 = new JLabel("성적");
        JTextField tf = new JTextField(20);
        label1.setPreferredSize(new Dimension(100, 30));
        tf.setPreferredSize(new Dimension(100, 30));
        firstRow.add(label1, BorderLayout.WEST);
        firstRow.add(tf, BorderLayout.EAST);
        center.add(firstRow);

        JPanel secondRow = new JPanel(new GridLayout(1, 2, 32, 10));
        JPanel secondRow1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel secondRow2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton button1 = new JButton("입력");
        JButton button2 = new JButton("평균계산");
        button1.setPreferredSize(new Dimension(130, 30));
        button2.setPreferredSize(new Dimension(130, 30));
        secondRow1.add(button1);
        secondRow2.add(button2);
        secondRow.add(secondRow1);
        secondRow.add(secondRow2);
        center.add(secondRow);

        JPanel thirdRow = new JPanel(new BorderLayout(25, 100));
        JLabel label2 = new JLabel("모든 학생의 평균");
        JTextField tf2 = new JTextField(15);
        thirdRow.add(label2, BorderLayout.WEST);
        thirdRow.add(tf2, BorderLayout.EAST);
        label2.setPreferredSize(new Dimension(100, 30));
        tf2.setPreferredSize(new Dimension(100, 30));
        center.add(thirdRow);

        button1.addActionListener(e -> {
            int score = Integer.parseInt(tf.getText());
            list.add(score);
            tf.setText("");
        });
        button2.addActionListener(e -> {
            for (int i = 0; i < list.size(); i++) {
                average = average + list.get(i);
            }
            result = average / list.size();
            tf2.setText(String.valueOf(result));
            return;
        });
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
        add(east, BorderLayout.EAST);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ex02();
    }
}
