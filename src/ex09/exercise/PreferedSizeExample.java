package ex09.exercise;

import javax.swing.*;
import java.awt.*;

public class PreferedSizeExample extends JFrame {

    public PreferedSizeExample() {
        setTitle("PreferredSize Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

        // 선호하는 크기를 설정한 패널
        JPanel panelWithPreferred = new JPanel();
        panelWithPreferred.setPreferredSize(new Dimension(100, 100));
        panelWithPreferred.setBackground(Color.RED);
        add(panelWithPreferred);

        // 선호하는 크기를 설정하지 않은 패널
        JPanel panelWithoutPreferred = new JPanel();
        panelWithoutPreferred.setBackground(Color.GREEN);
        add(panelWithoutPreferred);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PreferedSizeExample();
    }
}

