package ex03.test;

public class InsertSort {
    public static void main(String[] args) {
        int[] a = {8, 5, 6, 2, 4};
        int temp;

//        if (a[i] < a[i-1]){
//            temp = a[i-1];
//            a[i] = a[i-1];
//            a[i-1] = temp;
//        }

        if (a[2] < a[1]){
            temp = a[1];
            a[1] = a[2];
            a[2] = temp;
        }
        if (a[1] < a[0]){
            temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }

        if (a[3] < a[2]){
            temp = a[2];
            a[2] = a[3];
            a[3] = temp;
        }
        if (a[2] < a[1]){
            temp = a[1];
            a[1] = a[2];
            a[2] = temp;
        }
        if (a[1] < a[0]){
            temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }

        if (a[4] < a[3]){
            temp = a[3];
            a[3] = a[4];
            a[4] = temp;
        }
        if (a[3] < a[2]){
            temp = a[2];
            a[2] = a[3];
            a[3] = temp;
        }
        if (a[2] < a[1]){
            temp = a[1];
            a[1] = a[2];
            a[2] = temp;
        }
        if (a[1] < a[0]){
            temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }

        for (int q : a){
            System.out.print(q + " ");
        }
    }
}
