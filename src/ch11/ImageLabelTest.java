package ch11;

import javax.swing.*;

public class ImageLabelTest extends JFrame{
    private JPanel panel;
    private JLabel label;

    public ImageLabelTest() {
        setTitle("레이블 테스트");
        setSize(800,500);

        panel = new JPanel();
        label = new JLabel("");
        ImageIcon icon = new ImageIcon("C:\\Test\\car11.png");
        label.setIcon(icon);
        panel.add(label);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ImageLabelTest();
    }
}
