package ex04;

<<<<<<< HEAD
public class BoxTest {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("상자의 크기 : (" + b.width + "," + b.height + "," + b.depth + ")");
=======
class Box {
    int width;
    int length;
    int height;
    double getVolume(){
        return (double) width*length*height;
    }
}
public class BoxTest {
    public static void main(String[] args) {
        Box b;
        b = new Box();
        b.width = 20 ;
        b.length = 20 ;
        b.height = 30 ;
        System.out.println("상자의 가로, 세로, 높이는 " + b.width + ", " + b.length + ", " + b.height + "입니다.");
        System.out.println("상자의 부피는 " + b.getVolume() + "입니다.");
>>>>>>> 958e37c4b2882e8c86bc3cd3a7a09f8ce660884e
    }
}
