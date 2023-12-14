package ex03;

public class NestedLoop {
    public static void main(String[] args) {

        for (int y = 0; y < 5; y++) { // 열이 되었다.
            for (int x = 0; x < 10 ; x++) { // 행이되고
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
