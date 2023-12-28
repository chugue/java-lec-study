package ex07.excercise;

interface Animal1{
    void bark();
}

public class Test{

    public static void main(String[] args) {
        Animal1 dog = new Animal1() { //익명클래스 (;)이 아니라 {} 사용, 중괄호 안은 호출되어야 힙메모리에 뜸.
            @Override                 // 그래서 호출 되지 않으면, 괄호안은 열리지 않으므로, 메서드 호출을 밖에서 해야됨.
            public void bark() {
                System.out.println("컹컹");
            }
        }; // <-- 그리고 중괄호 뒤에 세미콜론
        dog.bark();
    }
}
