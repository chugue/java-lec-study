package ex05.exercise;

class MyMath{
    int multiply( int a, int b){
        return a  * b ;
    }
    static int add (int a, int b){
        return a + b ;
    }
}

public class Test01 {
    public static void main(String[] args) {
        MyMath obj = new MyMath();
        System.out.println("2 * 2 = " + obj.multiply(2, 2));
        System.out.println("2 * 2 = " + obj.add(2, 3));
    }
}
