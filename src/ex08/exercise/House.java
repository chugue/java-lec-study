package ex08.exercise;

import java.util.Arrays;

public class House {
    public static void main(String[] args) {
        String words = "This is a house";
        String[] howMany = words.split(" ");

        System.out.println(Arrays.toString(howMany));
        System.out.println("모두 " + howMany.length + "개의 단어가 있습니다.");
    }
}
