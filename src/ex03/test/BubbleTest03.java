package ex03.test;

public class BubbleTest03 {
    public static void main(String[] args) {
        int[] arr = {4,3};

        int temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp; // 스왑 로직 완성

        for (int a : arr){ // 잘 들어갔는지 테스트 코드, 항상 테스트하는 것이 중요!
            System.out.print(a + " ");
        }
    }
}
