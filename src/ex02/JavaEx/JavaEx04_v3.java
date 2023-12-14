package ex02.JavaEx;

public class JavaEx04_v3 {
    public static void main(String[] args) {
          boolean P;
          boolean Q;
          boolean AND;
          boolean OR;
          boolean XOR;

            System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR");

             P = true;
             Q = true;
             System.out.println(P +"\t"+ Q +"\t"+ (P && Q) +"\t"+ (P || Q)+"\t"+ (P ^ Q) );

             P = true;
             Q = false;
             System.out.println(P +"\t"+ Q +"\t"+ (P && Q) +"\t"+ (P || Q)+"\t"+ (P ^ Q) );

             P = false;
             Q = true;
             System.out.println(P +"\t"+ Q +"\t"+ (P && Q) +"\t"+ (P || Q)+"\t"+ (P ^ Q) );

             P = false;
             Q = false;
             System.out.println(P +"\t"+ Q +"\t"+ (P && Q) +"\t"+ (P || Q)+"\t"+ (P ^ Q) );
    }
}
