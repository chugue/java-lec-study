package ex10.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex01 extends JFrame {
    public Ex01() {
        setTitle("Problem #1");
        setSize(600,150);
        setLayout(new BorderLayout());
        JButton button = new JButton("버튼을 눌려보세요!");
        JLabel label = new JLabel("클릭 획수 :");
        JPanel west = new JPanel();
        JPanel east = new JPanel();
        JPanel north = new JPanel();
        JPanel center = new JPanel(new FlowLayout());

        button.setPreferredSize(new Dimension(500,30));
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int count = 0;
                count = count + e.getClickCount();
                label.setText("클릭 횟수 :" + count);
            }
        });

        label.setPreferredSize(new Dimension(500,20));

        center.add(button);
        center.add(label);
        north.setPreferredSize(new Dimension(500,30));

        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex01();
    }
}
