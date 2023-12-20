package ex04;

public class SafeArray {
    private int a[];
    public int length;

    public SafeArray(int size){ //2. 생성자에 파라메터 3 전달
        a = new int[size]; //3인덱스를 가진 배열 a
        length = size; // 길이는 3
    }
    public int get(int index) {
        if (index >= 0 && index < length){
         return a[index];
        }
        return -1;
    }
    public void put(int index, int value) {
        if (index >= 0 && index < length){
            a[index] = value;
        }else {
            System.out.println("잘못된 인덱스 " + index);
        }
    }
}

