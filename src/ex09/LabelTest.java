package ex09;
import java.awt.*;
import javax.swing.*;

public class LabelTest extends JFrame{
    private JPanel panel;
    private JLabel label1, label2;

    public LabelTest() {
        setTitle("레이블 테스트");
        setSize(400, 150);

        panel = new JPanel();
        label1 = new JLabel("Color Label");
        label1.setForeground(Color.blue);
        label2 = new JLabel("Font Label");
        label2.setFont(new Font("Arial", Font.ITALIC, 30));
        label2.setForeground(Color.orange);
        panel.add(label1);
        panel.add(label2);
        ImageIcon image = new ImageIcon("c://github_PNG40.png");
        JLabel label = new JLabel("git");
        label.setIcon(image);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        LabelTest t = new LabelTest();
    }

}

