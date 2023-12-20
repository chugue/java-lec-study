package ex03;

public class ArrayTest4 {

    public static void main(String[] args) {
        int [] numbers = { 10, 20, 30 };
//        System.out.println(numbers);  // numbers를 출력하면 그 배열의 주소값만 받을수 있다.
        for (int value : numbers){ // 각 요소를 출력하기 위해서는 for-each 구문이 필요하다.
            System.out.println(value + " ");
        }
    }
}
