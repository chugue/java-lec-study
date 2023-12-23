package ex03.test;
// target = 8

// start=0 ~ end = 8
//        // mid = N/2 = 4 -> arr[4] -> 값 5
//        // if(8==5) -> mid 위치에 타겟이 있다.
//        // if(8>5) 참
//
//
//        // start=5 (mid+1) ~ end=8
//        // mid = 7 = arr[7] -> 값 8
//        // if(8==8) -> mid 위치에 타겟이 있다.
//        // if(8>8)
//
//
//        // target = 3
//
//        // start=0 ~ end = 8
//        // mid = N/2 = 4 -> arr[4] -> 값 5
//        // if(3==5) -> mid 위치에 타겟이 있다.
//        // if(3>5) 거짓
//
//
//        // start=0 ~ end = mid-1
//        // mid = 7 = arr[7] -> 값 8
//        // if(8==8) -> mid 위치에 타겟이 있다.
//        // if(8>8)

public class BinaryTest02_4 {
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