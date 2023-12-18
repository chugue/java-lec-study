package ex03.test;

public class BinaryTest02 {
    public static void main(String[] args) {
        //이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = {1,2,3,4,5,6,7,8,9}; // 9 / 2 = 4
        final int target = 8;
        final int N = arr.length;
        int mid = N / 2;

        int count = 0;

//        if (arr[mid] == target){
//            System.out.println("a");
//        }
        if (arr[mid] < target){ //인덱스5678에서 검색
            count++;
            if (arr[mid+mid/2]== target){// 중간값 인덱스 7
                System.out.println("aa");
            }
            if (arr[mid+mid/2] < target) {
                count++;
                System.out.println("bb");
            }
            if (arr[mid+mid/2]> target){
                count++;
                System.out.println("cc");
            }
            System.out.println("b");
        }
//        if (arr[mid] > target){//인덱스0123 검색
//            count++;
//            if (arr[mid-mid/2]== target){// 중간값 인덱스 2
//
//            }
//            if (arr[mid-mid/2] < target) {
//                count++;
//            }
//            if (arr[mid-mid/2]> target){
//                count++;
//            }
//            System.out.println("c");
//        }

//        System.out.println(arr[4/2]);
    }
}
