package ch11.exercise;

import javax.swing.*;
import java.awt.*;

public class ex01 extends JFrame {
    public ex01() {
        setTitle("ex01");
        setSize(800, 300);
        setLayout(new GridLayout(1, 3, 10, 10));

        JLabel labelWest = new JLabel();
        JLabel labelCenter = new JLabel();
        JLabel labelEast = new JLabel();

        ImageIcon dogIcon = new ImageIcon("C:\\Test\\dog.png");
        ImageIcon catIcon = new ImageIcon("C:\\Test\\cat.png");
        ImageIcon birdIcon = new ImageIcon("C:\\Test\\bird.png");

        Image dog = dogIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image cat = catIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image bird = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);

        labelEast.setIcon(new ImageIcon(dog));
        labelCenter.setIcon(new ImageIcon(cat));
        labelWest.setIcon(new ImageIcon(bird));

        add(labelWest);
        add(labelCenter);
        add(labelEast);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ex01();
    }
}
