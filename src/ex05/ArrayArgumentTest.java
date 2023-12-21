package ex05;

public class ArrayArgumentTest {
    public static double minArray(double[] list) { // 1. minArray(a) || 2. minArray(b)
        double min = list[0]; // 1. 1.1 || 2. -2.0

        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return (min); // 1. 0.1 || 2. -9.0
    }
    public static void main(String[] args) {
     double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2}; // a[]은 스택메모리로 가고 우변은 힙메모리
     double[] b = {-2.0, 3.0, -9.0, 2.9, 1.5}; // b[]는 스택메모리로 가고 우변은 힙

     double min; // min 스택메모리

     min = minArray(a); // minArray(a)로 전달해서 호출 -> 반환값 0.1 min에 대입
        System.out.println("첫 번째 배열의 최소값 = " + min);
     min = minArray(b); // minArray(b)로 전달해서 호출 -> 반환값 -9.0 을 min에 대입
        System.out.println("두 번째 배열의 최소값 = " + min);
    }
}
