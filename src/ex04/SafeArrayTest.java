package ex04;

public class SafeArrayTest {
    public static void main(String[] args) {
        SafeArray array = new SafeArray(3);//1. Safe Array 객체생성

        for (int i = 0; i < (array.length + 1); i++) {
            array.put(i, i * 10); // (1,10) (2,20) (3,30) (4,40)
        }
    }
}
