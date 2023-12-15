package ex03;

public class RaggedArray {// ragged배열은 행마다 길이가 다른 배열
    public static void main(String[] args) {
        int[][] ragged = new int[3][]; // 여기서 [3]행과열을 가진 ragged배열을 생성한다.
        ragged[0] = new int[1]; //ragged(3,0)배열의 행에 1행을 가진 int배열을 생성한다.
        ragged[1] = new int[2]; //ragged(3,1)배열의 행에 2행을 가진 int배열을 생성한다.
        ragged[2] = new int[3]; //ragged(3,2)배열의 행에 3행을 가진 int배열을 생성한다.

        for (int r = 0; r < ragged.length; r++) {
            for (int c = 0; c < ragged[r].length; c++) {
                ragged[r][c] = c;
                System.out.print(ragged[r][c]+" ");
            }
            System.out.println();
        }
    }
}
