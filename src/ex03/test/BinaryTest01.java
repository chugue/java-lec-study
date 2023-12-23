package ex03.test;

public class BinaryTest01 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int target = 3;
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int round = 0;

        while (true) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                break ; // 값을 찾으면 반복을 종료한다.
            }
            if (arr[mid] < target) {
                start = mid + 1;
                round++;
            }
            if (arr[mid] > target) {
                end = mid - 1;
                round++;
            }
        }
        System.out.println("target값은 "+ mid + "이며, 총 " + round + "회전만에 찾았습니다.");
    }
}