package ex13;

class Box1 {
    static Object data;
}

public class GenericEx02 {
    public static void main(String[] args) {
        Box1.data = 1;
        Box1.data = "문자";
    }
}