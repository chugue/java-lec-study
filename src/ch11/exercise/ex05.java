package ch11.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


class People {
    private String name;
    private String phone;
    private String address;

    public People(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

public class ex05 extends JFrame {

    public ex05() {
        ArrayList<People> list = new ArrayList<>();
        setTitle("ex05");
        setSize(500, 350);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        JPanel main = new JPanel(new FlowLayout(FlowLayout.CENTER));
        main.setPreferredSize(new Dimension(500,400));

        JPanel mainCompo1 = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
        mainCompo1.setPreferredSize(new Dimension(440,40));
        JLabel label1 = new JLabel("이름 :");
        label1.setPreferredSize(new Dimension(100,30));
        JTextField text1 = new JTextField("김철수",30);
        text1.setPreferredSize(new Dimension(200,30));
        mainCompo1.add(label1);
        mainCompo1.add(text1);

        JPanel mainCompo2 = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
        mainCompo2.setPreferredSize(new Dimension(440,40));
        JLabel label2 = new JLabel("전화번호 :");
        label2.setPreferredSize(new Dimension(100,30));
        JTextField text2 = new JTextField("010-1111-2222",30);
        text2.setPreferredSize(new Dimension(200,30));
        mainCompo2.add(label2);
        mainCompo2.add(text2);


        JPanel mainCompo3 = new JPanel(new FlowLayout(FlowLayout.LEFT,0,10));
        mainCompo3.setPreferredSize(new Dimension(440,40));
        JLabel label3 = new JLabel("주소 :");
        mainCompo3.add(label3);

        JPanel mainCompo4 = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
        mainCompo4.setPreferredSize(new Dimension(440,90));
        JTextArea area = new JTextArea("서울시 종로구 1번지");
        area.setPreferredSize(new Dimension(450, 80));
        mainCompo4.add(area);

        JPanel mainCompo5 = new JPanel(new GridLayout(1,3,10,10));
        mainCompo5.setPreferredSize(new Dimension(440,35));
        JButton button1 = new JButton("저장");
        JButton button2 = new JButton("검색");
        JButton button3 = new JButton("종료");
        mainCompo5.add(button1);
        mainCompo5.add(button2);
        mainCompo5.add(button3);

        text1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                text1.setText("");
            }
        });
        text2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                text2.setText("");
            }
        });
        area.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                area.setText("");
            }
        });
        button1.addActionListener(e -> {
           list.add(new People (text1.getText(),text2.getText(), area.getText()));
           for (People a : list) {
               System.out.println(a);
           }
            System.out.println();
        });

        main.add(mainCompo1);
        main.add(mainCompo2);
        main.add(mainCompo3);
        main.add(mainCompo4);
        main.add(mainCompo5);
        add(main);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ex05();
    }
}
