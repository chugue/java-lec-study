package ex08.exercise.game;

import java.util.Scanner;

public class Dice {
    private int value;

    public Dice() {
        this.value = 1;
    }
    int roll(){
        int rand = (int)(Math.random()*6 + 1);
        return value = rand;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "Dice {" + "value=" + value + '}';
    }
    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.roll();
        System.out.println(dice.value);
    }
}
