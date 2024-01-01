package ex10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest03 extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    int counter = 0;

    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("현재의 카운터값 : " + counter);
    }

    public EventTest03() {
        this.setSize(400, 150);
        this.setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재의 카운터 값 : " + counter);
        button.addActionListener(this);
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        EventTest03 t = new EventTest03();
    }
}
