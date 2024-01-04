package ex16;

import javax.swing.*;
import java.awt.*;

public class CarGame extends JFrame {
    class MyThread extends Thread{
        private JLabel label;
        private int x, y;

        public MyThread (String fname, int x, int y){
            this.x = x;
            this.y = y;
            label = new JLabel();
            label.setIcon(new ImageIcon(fname));
            label.setBounds(x, y, 200, 200);
            add(label);
        }
        public void run (){
            for (int i = 0; i < 200; i++) {
                x += 10 * Math.random();
                label.setBounds(x,y,200,200);
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public CarGame () {
        setTitle("CarRace");
        setSize(1000,500);
        setLayout(null);
        (new MyThread("D:\\WORKSPACE\\java_lec\\Study\\src\\ex16\\car1.png", 100, 0)).start();
        (new MyThread("D:\\WORKSPACE\\java_lec\\Study\\src\\ex16\\car2.png", 100, 100)).start();
        (new MyThread("D:\\WORKSPACE\\java_lec\\Study\\src\\ex16\\car3.png", 100, 200)).start();
        setVisible(true);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        CarGame t = new CarGame();
    }
}
