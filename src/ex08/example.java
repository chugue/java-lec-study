package ex08;

class Exit {
    int c ;
    int d ;

    public Exit(int c, int d) {
        this.c = c;
        this.d = d;
    }
}

public class Example  {
    int a ;
    int b ;

    public Example(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Example ex = new Example(12, 12);
        Exit e1 = new Exit(42, 23);
        e1 = ex;
    }
}
