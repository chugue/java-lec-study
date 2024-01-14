package ex10.exercise;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex13_01 extends JFrame {
    private static int totalNum = 8;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= totalNum; i++) {
            list.add(String.valueOf(i));
        }
        list.add(" ");
        Collections.shuffle(list);
    }
}
