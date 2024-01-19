package ex10.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ex12 extends JFrame {

    public Ex12() {
        ArrayList<Graphics> list = new ArrayList<Graphics>();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Graphics g = getGraphics();
                g.setColor(Color.BLUE);
                g.fillRect(e.getX(), e.getY(), 50, 50);
                list.add(g);
            }
        });
        setTitle("Ex12");
        setSize(600, 200);
        setLayout(null);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex12();
    }
}

