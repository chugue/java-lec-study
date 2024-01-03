package ex16;

class MyRunnable01 implements Runnable {
    String myName;
    public MyRunnable01(String name){
        myName = name;
    }
    public void run (){
        for (int i = 0; i <= 10; i++) {
            System.out.println(myName + i + " ");
        }
    }
}


public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable01("A"));
        Thread t2 = new Thread(new MyRunnable01("B"));
        t1.start();
        t2.start();

    }
}
