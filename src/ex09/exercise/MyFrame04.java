package ex09.exercise;

import javax.swing.*;
import java.awt.*;

public class MyFrame04 extends JFrame {
    public MyFrame04() {
        setTitle("4번 문제");
        setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
        setSize(400, 150);

        add(makepanel("RED", Color.red, 10));
        add(makepanel("YELLOW", Color.yellow, 10));
        add(makepanel("Green", Color.green, 10));
        add(makepanel("Blue", Color.blue, 10));

        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private JPanel makepanel (String text, Color color, int gap ){
        JPanel panel = new JPanel(new BorderLayout());
        // 상부패널
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        panel.add(label, BorderLayout.NORTH);
        // 중부 패널 (갭)
        JPanel gapPanel = new JPanel();
        gapPanel.setPreferredSize(new Dimension(0,gap));
        gapPanel.setOpaque(false);
        panel.add(gapPanel, BorderLayout.CENTER);
        // 하부패널
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(color);
        colorPanel.setPreferredSize(new Dimension(50,50));
        panel.add(colorPanel, BorderLayout.SOUTH);

        return panel;
    }

    public static void main(String[] args) {
        MyFrame04 f = new MyFrame04();
    }
}
