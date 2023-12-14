package ex02.JavaEx;

public class JavaEx04_v2 {
    public static void main(String[] args) {
        boolean[] boolValues = {true, false};

        // 헤더 출력
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR");

        // 모든 논리 연산 조합을 출력
        for (boolean p : boolValues) {
            for (boolean q : boolValues) {
                // 각 논리 연산의 결과 계산
                boolean andResult = p && q;
                boolean orResult = p || q;
                boolean xorResult = p ^ q;

                // 결과 출력
                System.out.println(p + "\t" + q + "\t" + andResult + "\t" + orResult + "\t" + xorResult);
            }
        }
    }
}
