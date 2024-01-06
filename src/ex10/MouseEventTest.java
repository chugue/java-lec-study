package ex10;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEventTest extends JFrame implements MouseListener, MouseMotionListener {

    public MouseEventTest() {
        setTitle("Mouse Event");
        setSize(300, 200);

        JPanel panel = new JPanel();
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        display("Mouse clicked(# of clicks: " +  e.getClickCount() + ")", e);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        display("Mouse pressed (# of clicks : " + e.getClickCount() + ")", e);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        display("Mouse Released (# of clicks : " + e.getClickCount() + ")", e);
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        display("Mouse entered", e);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        display("Mouse exited", e);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        display("Mouse Dragged",e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        display("Mouse moved", e);
    }

    private void display(String s, MouseEvent e) {
        System.out.println(s + " X= " + e.getX() + " Y=" + e.getY());
    }
    public static void main(String[] args) {
        MouseEventTest f = new MouseEventTest();
    }

}
