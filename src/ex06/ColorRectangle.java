package ex06;

class Rectangle02 {
    int width, height;
    public Rectangle02(int width, int height){
        this.width = width;
        this.height = height;
    }
}
public class ColorRectangle extends Rectangle02{
    String color;

    public ColorRectangle(int width, int height, String color) {
        super(width, height); // super로 변수를 입력해주면 부모 클래스 인자를 가져온다.
        this.color = color;
    }
    public static void main(String[] args) {
        ColorRectangle obj = new ColorRectangle(100, 100, "blue");
        System.out.println("가로 : " + obj.width);
        System.out.println("세로 : " + obj.height);
        System.out.println("색상 : " + obj.color);
    }
}
