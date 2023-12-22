package ex06.example5;


class 왕 extends 판사{
    public void 심문(){
        System.out.println("왕은 심문한다.");
    }
}
class 왕비 extends 판사{
    public void 심문(){
        System.out.println("왕비는 심문한다.");
    }
}
abstract class 판사 { // Object가 아니다. new 할수 없는 애들
    public abstract void 심문();
}
abstract class 증인 { // Object가 아니다. new 할 수 없는 애들
    public abstract void 대답();
}

class 모자장수 extends 증인{
    public void 대답(){
        System.out.println("모자장수는 대답한다.");
    }
}
class 토끼 extends 증인{
    public void 대답(){
        System.out.println("토끼는 대답한다.");
    }
}
class 엘리스 extends 증인{
    @Override
    public void 대답() {
        System.out.println("엘리스는 대답한다.");
    }
}


class Game {
    public void 심문(왕비 u1) {

    }
    public void 대답(모자장수 u1) {

    }
}




public class AliceApp {

    public static void main(String[] args) {
        판사 u1 = new 왕비(); // [판사, 왕비]
        증인 u2 = new 엘리스(); // [증인, 엘리스]

        u1.심문();
        u2.대답();
    }
}
