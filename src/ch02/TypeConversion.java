package ch02;

public class TypeConversion {
    public static void main(String[] args) {
        int i;
        double f;

        f = 1 / 5;
        System.out.println(f); // 1/5는 피연자가 정수이므로 정수 연산으로 계산되어서 0이 된다.
                               // 이것이 double형 변수로 대입되므로 올림 변환이 발생하여 0.0이 f에 저장된다.

        f = (double) 1 / 5;
        System.out.println(f); // 여기에서는 먼저 형변환 연산자가 우선순위가 높기 떄문에 먼저실행되어서
                               // 정수 1가 부동소수점수 1.0으로 변환된다. 1.0/5는 피연산자중 하나가
                               // double형이므로 5도 double형으로 자동 형변환 되고,
                               // 1.0/5.0으로 계산되어서 0.2가 수식의 결과값이 된다.

        i = (int) 1.7 + (int) 1.8;
        System.out.println(i); // 수식 (int)1.7 + (int) 1.8에서는 1.7과 1.8이 모두 1로 변환되므로
                               // 변수 i에는 1+1연산 결과인 2가 저장된다.
    }
}
