package ex09.exercise;

import javax.swing.*;
import java.awt.*;

public class MyFrame04_01 extends JFrame {

    public MyFrame04_01() {
        setTitle("JLabel Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        add(createColorPanel("Red", Color.RED));
        add(createColorPanel("Yellow", Color.YELLOW));
        add(createColorPanel("Green", Color.GREEN));
        add(createColorPanel("Blue", Color.BLUE));

        pack();
        setLocationRelativeTo(null); // 창을 화면 가운데에 위치
        setVisible(true);
    }

    private JPanel createColorPanel(String colorName, Color color) {
        JPanel colorPanel = new JPanel(new BorderLayout());
//        colorPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JLabel colorLabel = new JLabel(colorName);
        colorLabel.setHorizontalAlignment(JLabel.CENTER);
        colorPanel.add(colorLabel, BorderLayout.NORTH);

        JPanel colorSquare = new JPanel();
        colorSquare.setBackground(color);
        colorSquare.setPreferredSize(new Dimension(50, 50));
        colorPanel.add(colorSquare, BorderLayout.CENTER);

        return colorPanel;
    }

    public static void main(String[] args) {
        new MyFrame04_01();
    }
}