package ex03.exam;

/*
369게임을 만들어보자. 369게임은 3,6,9가 포함되어 있으면 3,6,9의 개수만큼
박수를 치는 게임이다. 1부터 50까지의 정수에 대하여 3,6,9 게임을 실행한다.
----- 출력창 -----
 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝...
 */
public class ex03Exam03 {
    public static void main(String[] args) {
        // tsn이라는 문자를 저장할수 있는 배열 50공간 선언
        String[] tsn = new String[50];

        // 배열 순차적 공간에 1부터 50까지 대입
        for (int i = 0; i < 50; i++) {
            tsn[i] = String.valueOf(i + 1);
        }
       // 배열의 각 요소를 순회
        for (String a : tsn){
            int count = 0;
            //각 배열요소의 문자열수만큼 순회, 1= 1회, 20=2회
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i); //각 배열요소의 문자하나씩 대입
                if (c == '3' || c == '6' ||c == '9'){
                    count++;
                }
            }
            if (count > 0){
                for (int j = 0; j < count; j++) {
                    System.out.print("짝");
                }
                System.out.print(", ");
            }else{
                System.out.print(a + ", ");
            }
        }
    }
}

