package ex09.exercise;
import javax.swing.*;
import java.awt.*;

public class RandomFrame extends JFrame {
    public RandomFrame (){
        setTitle("Random Frame");
        setSize(600,200);
        setLayout(new GridLayout(4,5,1,1));

        for (int i = 0; i < 20; i++) {
            JLabel num = new JLabel(String.valueOf(i), SwingConstants.CENTER);
            int R = (int)(Math.random()*256);
            int G = (int)(Math.random()*256);
            int B = (int)(Math.random()*256);
            num.setBackground(new Color(R,G,B));
            num.setOpaque(true);
            add(num);
        }
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new RandomFrame();
    }
}
