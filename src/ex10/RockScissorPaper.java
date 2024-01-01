package ex10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockScissorPaper extends JFrame implements ActionListener {
    final int Scissor = 0;
    final int Rock = 1;
    final int Paper = 2;

    private JPanel panel;
    private JLabel output, information;
    private JButton rock, paper, scissor;

    public RockScissorPaper() {
        setTitle("가위, 바위, 보");
        setSize(400, 150);

        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3));

        information = new JLabel("아래의 버튼 중에서 하나를 클릭하시오.", SwingConstants.CENTER);
        output = new JLabel("Good Luck!", SwingConstants.CENTER);
        rock = new JButton("1 : 바위");
        scissor = new JButton("0 : 가위");
        paper = new JButton("2 : 보");

        rock.addActionListener(this);
        paper.addActionListener(this);
        scissor.addActionListener(this);

        panel.add(rock);
        panel.add(paper);
        panel.add(scissor);

        add(information, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(output, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        RockScissorPaper f = new RockScissorPaper();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        int user = Integer.parseInt("" + b.getText().charAt(0));

        int computer = (int) (Math.random() * 3 + 1);
        if (user == computer) {
            output.setText("인간과 컴퓨터가 비겼음");
        } else if (user == (computer + 1) % 3) {
            output.setText("인간 : " + user + ", 컴퓨터 : " + computer + ", 인간 승리");
        } else {
            output.setText("인간 : " + user + ", 컴퓨터 : " + computer + ", 컴퓨터 승리");
        }
    }
}