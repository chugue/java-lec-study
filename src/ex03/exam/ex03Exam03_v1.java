package ex03.exam;
/*
369게임을 만들어보자. 369게임은 3,6,9가 포함되어 있으면 3,6,9의 개수만큼
박수를 치는 게임이다. 1부터 50까지의 정수에 대하여 3,6,9 게임을 실행한다.
----- 출력창 -----
 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝...
 */
public class ex03Exam03_v1 {
    public static void main(String[] args) {
        String[] tsn = new String[50];

        // 배열 초기화
        for (int i = 0; i < 50; i++) {
            tsn[i] = String.valueOf(i + 1);
        }

        for (String a : tsn) { // 배열a의 각 요소를 하나씩 순회
            int clapCount = 0;

            // 문자열의 각 문자를 확인
            for (int j = 0; j < a.length(); j++) { // 여기서 a.length는 각 요소의 문자열길이.
                char c = a.charAt(j);
                if (c == '3' || c == '6' || c == '9') {
                    clapCount++;
                }
            }

            // 카운트에 따른 출력
            if (clapCount > 0) {
                for (int j = 0; j < clapCount; j++) {
                    System.out.print("짝");
                }
                System.out.print(", ");
            } else {
                System.out.print(a + ", ");
            }
        }
    }
}