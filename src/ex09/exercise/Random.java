package ex09.exercise;
import javax.swing.*;
public class Random extends JFrame {

    public Random(){
        setTitle("Random");
        setSize(500,200);
        setLayout(null);

        for (int i = 0; i < 20; i++) {
            add(randomLocation());
        }
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public JLabel randomLocation (){
        int rand = (int)(Math.random()*30);
        JLabel r = new JLabel(String.valueOf(rand));
        int x = (int)(Math.random()*(500-60));
        int y = (int)(Math.random()*(200-60));
        r.setBounds(x,y,30,30);
        return r;
    }
    public static void main(String[] args) {
        new Random();
    }
}
