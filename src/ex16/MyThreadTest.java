package ex16;

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ");
        }
    }
}
public class MyThreadTest {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}
