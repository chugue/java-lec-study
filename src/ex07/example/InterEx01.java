package ex07.example;

interface Remocon {
    public abstract void on();

    public abstract void off();
}

class SamsungRemocon implements Remocon {
    @Override
    public void on() {
        System.out.println("삼성 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모컨 off");
    }
}
class LgRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("엘지 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("엘지 리모컨 off");
    }
}

/**
 * 작성자 : 홍길동
 * 날짜 : 2023.12.26
 * 구현체 : SamsungRemocon, Lgremocon
 */

// [Remocon <--, SamsungRemocon]
// [Remocon <--, LgRemocon]

// (Remocon, SamsungRemocon) 부모타입의 자식객체


class CommonRemocon {
    private Remocon r;

    public CommonRemocon(Remocon r) {
        this.r = r;
    }
    public void on () {
        r.on();
    }
    public void off () {
        r.off();
    }
}
public class InterEx01 {
    public static void main(String[] args) {
        Remocon Samsung = new SamsungRemocon();
        CommonRemocon cr = new CommonRemocon(new SamsungRemocon());
        cr.on();
    }
}