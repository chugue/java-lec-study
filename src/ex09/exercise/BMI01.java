package ex09.exercise;

import javax.swing.*;
import java.awt.*;

public class BMI01 extends JFrame {

    public BMI01() {
        setTitle("BMI 변환기");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10)); // 전체 레이아웃에 대한 간격 추가

        add(createInputPanel(), BorderLayout.CENTER);
        add(createButtonPanel(), BorderLayout.SOUTH);

        setLocationRelativeTo(null); // 창을 화면 가운데에 위치시킵니다.
        setVisible(true);
    }

    private JPanel createInputPanel() {
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

        // 체중 입력 세트
        JPanel weightPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        weightPanel.add(new JLabel("나의 체중(kg):"));
        weightPanel.add(new JTextField(10));

        // 키 입력 세트
        JPanel heightPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        heightPanel.add(new JLabel("나의 키(m):"));
        heightPanel.add(new JTextField(10));

        inputPanel.add(createLabelPanel("나의 BMI 지수는 얼마나 될까?"));
        inputPanel.add(weightPanel);
        inputPanel.add(heightPanel);

        return inputPanel;
    }

    private JPanel createLabelPanel(String text) {
        JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        labelPanel.add(new JLabel(text));
        return labelPanel;
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(new JButton("BMI 확인하기"));
        return buttonPanel;
    }

    public static void main(String[] args) {
        new BMI01();
    }
}