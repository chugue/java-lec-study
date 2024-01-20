package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxFrame extends JFrame implements ActionListener {
    JLabel label;

    public ComboBoxFrame () {
        setTitle("콤보 박스");
        setSize(400,200);

        String[] animals = {"dog", "cat", "bird"};
        JComboBox animalList = new JComboBox(animals);
        animalList.setSelectedIndex(0);
        animalList.addActionListener(this);

        label = new JLabel();
        changePicture(animals[animalList.getSelectedIndex()]);
        add(animalList, BorderLayout.NORTH);
        add(label, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        String name = (String) cb.getSelectedItem();
        changePicture(name);
    }

    private void changePicture(String name) {
        ImageIcon icon =new ImageIcon("C:\\test\\" + name + ".png");
        label.setIcon(icon);
        if (icon != null) {
            label.setText(null);
        } else {
            label.setText("이미지가 발견되지 않았습니다. ");
        }
    }

    public static void main(String[] args) {
        ComboBoxFrame frame = new ComboBoxFrame();
    }
}
