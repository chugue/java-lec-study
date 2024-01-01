package ex09.exercise;

import javax.swing.*;
import java.awt.*;

public class MemberReg extends JFrame {
    public MemberReg (){
        setTitle("회원 등록하기");
        setSize(600,280);
        setLayout(new BorderLayout());

        add(northPanel(),BorderLayout.NORTH);
        add(middlePanel(),BorderLayout.CENTER);
        add(westPanel(),BorderLayout.WEST);
        add(eastPanel(),BorderLayout.EAST);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public JLabel northPanel(){
        JLabel reg = new JLabel("회원 등록하기", SwingConstants.CENTER);
        reg.setPreferredSize(new Dimension(500,40));
        reg.setFont(new Font(reg.getFont().getName(), reg.getFont().getStyle(), 15));
        return reg;
    }
    public JPanel middlePanel(){
        JPanel middlePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT,20,15));
        JLabel name = new JLabel("이름", SwingConstants.LEFT);
        JLabel pass = new JLabel("패스워드", SwingConstants.LEFT);
        JLabel email = new JLabel("이메일주소", SwingConstants.LEFT);
        JLabel phone = new JLabel("전화번호", SwingConstants.LEFT);
        JTextField t1 = new JTextField("홍길동",20);
        JTextField t2 = new JTextField("******",20);
        JTextField t3= new JTextField("abc@example.com",20);
        JTextField t4 = new JTextField("010-1234-5678",20);
        name.setPreferredSize(new Dimension(120,20));
        pass.setPreferredSize(new Dimension(120,20));
        email.setPreferredSize(new Dimension(120,20));
        phone.setPreferredSize(new Dimension(120,20));
        t1.setPreferredSize(new Dimension(100,20));
        t2.setPreferredSize(new Dimension(100,20));
        t3.setPreferredSize(new Dimension(100,20));
        t4.setPreferredSize(new Dimension(100,20));

        middlePanel.add(name);
        middlePanel.add(t1);
        middlePanel.add(pass);
        middlePanel.add(t2);
        middlePanel.add(email);
        middlePanel.add(t3);
        middlePanel.add(phone);
        middlePanel.add(t4);

        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton button1 = new JButton("등록하기");
        button1.setPreferredSize(new Dimension(150,20));
        JButton button2 = new JButton("취소");
        button2.setPreferredSize(new Dimension(150,20));

        southPanel.add(button1);
        southPanel.add(button2);
        middlePanel.add(southPanel);

        return middlePanel;
    }
    public JPanel westPanel (){
        JPanel west = new JPanel();
        west.setPreferredSize(new Dimension(20,50));
        return west;
    }
    public JPanel eastPanel (){
        JPanel east = new JPanel();
        east.setPreferredSize(new Dimension(150,50));
        return east;
    }
    public static void main(String[] args) {
        new MemberReg();

    }
}
