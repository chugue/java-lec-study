package ex03.test;

public class BubbleTest03 {
    public static void main(String[] args) {
        int[] arr = {4,3};

        int temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp; // 스왑 로직 완성

        for (int a : arr){
            System.out.print(a + " ");
        }
    }
}
