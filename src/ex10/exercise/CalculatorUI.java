package ex10.exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame {
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JTextField resultField;

    public CalculatorUI() {
        createUI();
    }

    private void createUI() {
        setTitle("Calculator");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 서쪽 패널에 라벨 추가
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new FlowLayout(FlowLayout.RIGHT,10,11));
        westPanel.setPreferredSize(new Dimension(150,300));
        JLabel l1 =  new JLabel("첫 번째 정수 :", SwingConstants.RIGHT);
        JLabel l2 =  new JLabel("두 번째 정수 :", SwingConstants.RIGHT);
        JLabel l3 =  new JLabel("연산의 결과 :", SwingConstants.RIGHT);
        l1.setPreferredSize(new Dimension(120,20));
        l2.setPreferredSize(new Dimension(120,20));
        l2.setPreferredSize(new Dimension(120,20));

        westPanel.add(l1);
        westPanel.add(l2);
        westPanel.add(l3);
        add(westPanel, BorderLayout.WEST);

        // 북쪽 패널에 공간 추가
        JPanel northPanel = new JPanel();
        northPanel.setPreferredSize(new Dimension(200,20));
        add(northPanel, BorderLayout.NORTH);

        // 중앙 패널에 텍스트 필드 추가
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        firstNumberField = new JTextField(30);
        secondNumberField = new JTextField(30);
        resultField = new JTextField(30);
        resultField.setEditable(false); // 결과 필드는 수정 불가능하게 설정
        centerPanel.add(firstNumberField);
        centerPanel.add(secondNumberField);
        centerPanel.add(resultField);
        JButton addButton = new JButton("Add");
        JButton clearButton = new JButton("Clear");
        addButton.setPreferredSize(new Dimension(100,20));
        clearButton.setPreferredSize(new Dimension(100,20));
        centerPanel.add(addButton);
        centerPanel.add(clearButton);
        add(centerPanel, BorderLayout.CENTER);

        // 'Add' 버튼 액션 설정
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int firstNumber = Integer.parseInt(firstNumberField.getText());
                int secondNumber = Integer.parseInt(secondNumberField.getText());
                int result = firstNumber + secondNumber;
                resultField.setText(String.valueOf(result));
            }
        });

        // 'Clear' 버튼 액션 설정
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumberField.setText("");
                secondNumberField.setText("");
                resultField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorUI().setVisible(true);
            }
        });
    }
}
