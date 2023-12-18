package ex03.exam;
/*
"Hello", "Java", "World"를 가지고 있는 문자열의 배열을 생성해보자.
화면에 배열 요소를 출력하는 프로그램을 작성해본다.
--------출력문---------
Hello
Java
World
---------------------
 */
public class ex03Exam11 {
    public static void main(String[] args) {
        String[] java = {"Hello", "Java", "World"};
        for (String a : java){
            System.out.println(a);
        }
    }
}
