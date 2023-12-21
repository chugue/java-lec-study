package ex05.myMath;

public class MyMath {
    public static int abs(int x) {
        return x>0?x:-x;
    }
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

}
