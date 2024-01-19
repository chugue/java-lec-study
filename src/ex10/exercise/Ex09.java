package ex10.exercise;
import javax.swing.*;
import java.awt.*;

public class Ex09 extends JFrame {

    public Ex09 () {
        setTitle("빠징코");
        setSize(500,200);
        setLayout(new BorderLayout());

        //west Panel
        JPanel west = new JPanel();
        west.setPreferredSize(new Dimension(100,50));

        //center Panel
        JPanel center = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label1 = new JLabel("0");
        JLabel label2 = new JLabel("0");
        JLabel label3 = new JLabel("0");
        label1.setPreferredSize(new Dimension(100,100));
        label2.setPreferredSize(new Dimension(100,100));
        label3.setPreferredSize(new Dimension(100,100));
        label1.setFont(new Font("Arial", Font.ITALIC,100));
        label2.setFont(new Font("Arial", Font.ITALIC,100));
        label3.setFont(new Font("Arial", Font.ITALIC,100));
        JButton button = new JButton("스핀");
        button.setPreferredSize(new Dimension(300,30));
        button.addActionListener((e) -> {
            label1.setText(String.valueOf((int)(Math.random()*10)));
            label2.setText(String.valueOf((int)(Math.random()*10)));
            label3.setText(String.valueOf((int)(Math.random()*10)));
        });
        center.add(label1);
        center.add(label2);
        center.add(label3);
        center.add(button);

        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex09();
    }
}
