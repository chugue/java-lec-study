package ch11.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.HashMap;

public class ex04 extends JFrame {
    int total = 0;

    public ex04() {
        HashMap<String, Integer> map = new HashMap<>();
        setTitle("ex04");
        setSize(800, 200);

        JPanel north = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
        north.setPreferredSize(new Dimension(200, 50));
        JCheckBox check1 = new JCheckBox("엔진오일 교환");
        JCheckBox check2 = new JCheckBox("자동변속기오일교환");
        JCheckBox check3 = new JCheckBox("에어콘필터교환");
        JCheckBox check4 = new JCheckBox("타이어교환");
        map.put(check1.getText(), 45000);
        map.put(check2.getText(), 80000);
        map.put(check3.getText(), 30000);
        map.put(check4.getText(), 100000);
        north.add(check1);
        north.add(check2);
        north.add(check3);
        north.add(check4);

        JPanel center = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel label = new JLabel("원하시는 서비스를 선택해주세요");
        label.setFont(new Font("Gothic", Font.ITALIC, 35));
        center.add(label);

        check1.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                total = total + map.get(check1.getText());
                label.setText("현재까지의 가격은" + total + "입니다.");
            } else {
                total = total - map.get(check1.getText());
                label.setText("현재까지의 가격은" + total + "입니다.");
            }
        });
        check2.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                total = total + map.get(check2.getText());
                label.setText("현재까지의 가격은" + total + "입니다.");
            } else {
                total = total - map.get(check2.getText());
                label.setText("현재까지의 가격은" + total + "입니다.");
            }
        });
        check3.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                total = total + map.get(check3.getText());
                label.setText("현재까지의 가격은" + total + "입니다.");
            } else {
                total = total - map.get(check3.getText());
                label.setText("현재까지의 가격은" + total + "입니다.");
            }
        });
        check4.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                total = total + map.get(check4.getText());
                label.setText("현재까지의 가격은" + total + "입니다.");
            } else {
                total = total - map.get(check4.getText());
                label.setText("현재까지의 가격은" + total + "입니다.");
            }
        });



        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ex04();
    }
}
