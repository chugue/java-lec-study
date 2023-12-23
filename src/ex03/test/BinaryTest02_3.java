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

public class BinaryTest02_3 {
    public static void main(String[] args) {
                // N = 13
                // 시간복잡도 log2(N) -> log2(13) -> 3.700 (3과 4사이)
                // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
                // 16 / 2*2*2*2 -> logn -> log16
                int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                int N = arr.length;
                final int target = 5;
                int start = 0;
                int end = N - 1;
                int mid;

                int round = 1;
                while (true) {
                    // 1 회전
                    mid = start + ((end - start) / 2); // 기대값 6

                    if (arr[mid] == target) {
                        System.out.println(round + "회전 : " + target + "값은 " + mid + "번지에 있습니다");
                        break;
                    }

                    if (arr[mid] < target) { // 기대값 start 5, end 8
                        start = mid + 1;
                    }

                    if (arr[mid] > target) {
                        end = mid - 1;
                    }

                    System.out.println(round + "회전 start : " + start);
                    System.out.println(round + "회전 end : " + end);

                    round++;
                }

                System.out.println("시간복잡도 : " + (Math.log(N) / Math.log(2)));
            }
        }