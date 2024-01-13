package ex10.exercise;
import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class Ex11 extends JFrame {
    int result;
    int userChoice;
    int comChoice;

    public Ex11() {
        setTitle("Ex11");
        setSize(600, 400);
        setLayout(new BorderLayout());

        //north panel
        JPanel north = new JPanel();
        north.setPreferredSize(new Dimension(200, 50));
        JLabel name = new JLabel("가위, 바위, 보 게임");
        name.setFont(new Font("Arial Unicode", Font.PLAIN, 30));
        north.add(name);

        //west panel
        JPanel west = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        west.setPreferredSize(new Dimension(200, 200));
        JButton userButton1 = new JButton("가위");
        JButton userButton2 = new JButton("바위");
        JButton userButton3 = new JButton("보");
        JLabel user = new JLabel("사용자");
        user.setPreferredSize(new Dimension(50, 50));
        userButton1.setPreferredSize(new Dimension(180, 70));
        userButton2.setPreferredSize(new Dimension(180, 70));
        userButton3.setPreferredSize(new Dimension(180, 70));
        west.add(userButton1);
        west.add(userButton2);
        west.add(userButton3);
        west.add(user);
        Color originalColor = userButton1.getBackground();

        //center panel
        JPanel center = new JPanel(new BorderLayout());
        center.setPreferredSize(new Dimension(200, 200));
        JLabel vs = new JLabel("VS", CENTER);
        vs.setFont(new Font("Arial", Font.PLAIN, 50));
        vs.setPreferredSize(new Dimension(50, 150));
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,5));
        southPanel.setPreferredSize(new Dimension(200,100));
        JButton newGame = new JButton("과연 승자는??");
        newGame.setFont(new Font("Arial Unicode", Font.PLAIN, 15));
        newGame.setPreferredSize(new Dimension(170, 90));
        southPanel.add(newGame);

        center.add(vs, BorderLayout.CENTER);
        center.add(southPanel, BorderLayout.SOUTH);

        //east panel
        JPanel east = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        east.setPreferredSize(new Dimension(200, 200));
        JButton comButton1 = new JButton("가위");
        JButton comButton2 = new JButton("바위");
        JButton comButton3 = new JButton("보");
        JLabel com = new JLabel("컴퓨터");
        com.setPreferredSize(new Dimension(50, 50));
        comButton1.setPreferredSize(new Dimension(180, 70));
        comButton2.setPreferredSize(new Dimension(180, 70));
        comButton3.setPreferredSize(new Dimension(180, 70));
        east.add(comButton1);
        east.add(comButton2);
        east.add(comButton3);
        east.add(com);

        userButton1.addActionListener(e -> {
            userChoice = 0;
            comChoice = (int)(Math.random() * 3);
            userButton1.setBackground(Color.yellow);
            userButton1.setOpaque(true);
            result = (userChoice - comChoice + 3) % 3;
            if (result == 0) {
                comButton1.setBackground(Color.RED);
                comButton1.setOpaque(true);
                newGame.setText("<html>무승부입니다.<br>[ 새 게임 <- 클릭 ]</html>");
            }
            if (result == 1) {
                comButton3.setBackground(Color.RED);
                comButton3.setOpaque(true);
                newGame.setText("<html>사용자 승리!!<br>[ 새 게임 <- 클릭 ]</html>");
            }
            if (result == 2) {
                comButton2.setBackground(Color.RED);
                comButton2.setOpaque(true);
                newGame.setText("<html>컴퓨터 승리!!<br>[ 새 게임 <- 클릭 ]</html>");
            }
        });
        userButton2.addActionListener(e -> {
            userChoice = 1;
            comChoice = (int)(Math.random() * 3);
            userButton2.setBackground(Color.yellow);
            userButton2.setOpaque(true);
            result = (userChoice - comChoice + 3) % 3;
            if (result == 0) {
                comButton2.setBackground(Color.RED);
                comButton2.setOpaque(true);
                newGame.setText("<html>무승부입니다.<br>[ 새 게임 <- 클릭 ]</html>");
            }
            if (result == 1) {
                comButton1.setBackground(Color.RED);
                comButton1.setOpaque(true);
                newGame.setText("<html>사용자 승리!!<br>[ 새 게임 <- 클릭 ]</html>");
            }
            if (result == 2) {
                comButton3.setBackground(Color.RED);
                comButton3.setOpaque(true);
                newGame.setText("<html>컴퓨터 승리!!<br>[ 새 게임 <- 클릭 ]</html>");
            }
        });
        userButton3.addActionListener(e -> {
            userChoice = 2;
            comChoice = (int)(Math.random() * 3);
            userButton3.setBackground(Color.yellow);
            userButton3.setOpaque(true);
            result = (userChoice - comChoice + 3) % 3;
            if (result == 0) {
                comButton3.setBackground(Color.RED);
                comButton3.setOpaque(true);
                newGame.setText("<html>무승부입니다.<br>[ 새 게임 <- 클릭 ]</html>");
            }
            if (result == 1) {
                comButton2.setBackground(Color.RED);
                comButton2.setOpaque(true);
                newGame.setText("<html>사용자 승리!!<br>[ 새 게임 <- 클릭 ]</html>");
            }
            if (result == 2) {
                comButton1.setBackground(Color.RED);
                comButton1.setOpaque(true);
                newGame.setText("<html>컴퓨터 승리!!<br>[ 새 게임 <- 클릭 ]</html>");
            }
        });
        newGame.addActionListener(e -> {
            userChoice = 0;
            comChoice = 0;
            userButton1.setBackground(originalColor);
            userButton2.setBackground(originalColor);
            userButton3.setBackground(originalColor);
            comButton1.setBackground(originalColor);
            comButton2.setBackground(originalColor);
            comButton3.setBackground(originalColor);
            newGame.setText("게임 시작!");

        });
        add(north, BorderLayout.NORTH);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
        add(east, BorderLayout.EAST);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex11();
    }
}
