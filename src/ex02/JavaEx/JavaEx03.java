package ex02.JavaEx;

public class JavaEx03 {
    public static void main(String[] args) {
    int x = 10;
    int y = 20;

    int sum = x + y;
    int sub = x - y;
    int mul = x * y;
    double avg = (x + y) / 2;
    int bigger = (x > y) ? x : y; // x가 y보다 크다면 x 값
    int lower = (x < y) ? x : y;  // x가 y보다 작다면 y 값

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(avg);
        System.out.println(bigger);
        System.out.println(lower);
    }
}
