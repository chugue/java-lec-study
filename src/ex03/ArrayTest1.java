package ex03;

public class ArrayTest1 {
    public static void main(String[] args) {

        int[] s = new int[10];

        for (int i = 0; i < s.length; i++) {
            s[i] = i;  // 각 배열을 순회하는 순서대로 대입하게됨
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
