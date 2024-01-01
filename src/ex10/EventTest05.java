package ex10;

import javax.swing.*;

public class EventTest05 extends JFrame {
    private JButton button;
    private JLabel label;
    int counter = 0;

    public EventTest05 () {
        this.setSize(400,150);
        this.setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재의 카운터 값 : " + counter);
        button.addActionListener(e -> {
            counter ++;
            label.setText("현재의 카운터 값 : " + counter);
        });
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        EventTest05 t = new EventTest05();
    }
}
