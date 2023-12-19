package ex04;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); // new로 동적할당으로 띄울수 있는데, 이떄 static 안붙은거는 다 띄우게 된다.
        cal.add(50, 80); //함수 결과를 출력을 받고 싶을 때, return이 필요한 것이다. 실행되면 리턴값인 130으로 치환된다.
        int result = cal.add(50, 80);
        System.out.println("add : " + result);

        int mul = cal.mul(10,70);
        System.out.println("mul : " + mul);

        int divide = cal.divide(90, 5);
        System.out.println("divide : " + divide);

        int minus = cal.minus(50, 25);
        System.out.println("minus : " + minus);
    }
}
