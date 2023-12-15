package ex03;

import java.util.Arrays;

public class RaggedArray2 {
    public static void main(String[] args) {
        int[][] rarray = new int [3][]; //2차원의 int배열에 3개의 행을 초기화 하고 열은 정의되지 않음

        rarray[0] = new int [] { 1, 2, 3, 4 }; // rarray배열의 0행에 int배열 1,2,3,4로 초기화
        rarray[1] = new int [] { 4, 5, 7  }; // rarray배열의 1행에 int배열 4,5,7로 초기화
        rarray[2] = new int [] { 8, 9 }; // rarray배열의 2행에 int배열 8,9 로 초기화

        for (int[] row : rarray){ //rarray의 행을 모두 순회하는 row변수 할당하는 foreach구문
            System.out.println(Arrays.toString(row));
            // foreach 구문으로 rarray의 모든 행을 순회하고 Arrays.toString으로 각 행의 문자열을 변환하여 출력
        }
    }
}
