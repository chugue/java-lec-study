package ex02.JavaEx;

public class JavaEx04 {
    public static void main(String[] args) {
        char a = 'P';
        char b = 'Q';
        String c = "AND";
        String d = "OR";
        String e = "XOR";

        for (int i = 0; i < 5; i++) {
            if (i == 0){
                System.out.println(a);
                for (int j = 0; j < 4; j++) {
                    if (j < 2){
                        System.out.println("true");
                    }else {
                        System.out.println("false");
                    }
                }
                System.out.println("\t");
                continue;
            }else if(i == 1){
                System.out.println(b);
                for (int h = 0; h < 4; h++) {
                    if (h % 2 == 0){
                        System.out.println("true");
                    }else{
                        System.out.println("false");
                    }continue;
                }
            }else if(i == 2){
                System.out.println(c);
                for (int k = 0; k < 4; k++) {
                    if (k < 1){
                        System.out.println("true");
                    } else{
                        System.out.println("false");
                    }continue;
                }
            }else if(i == 3){
                System.out.println(d);
                for (int l = 0; l < 4; l++) {
                    if (l < 3){
                        System.out.println("true");
                    }else{
                        System.out.println("false");
                    }continue;
                }
            }else{
                System.out.println(e);
                for (int m = 0; m < 4; m++) {
                    if (m > 0 && m < 3){
                        System.out.println("true");
                    }else{
                        System.out.println("false");
                    }continue;
                }
            }
        }
    }
}
