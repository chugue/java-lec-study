package ex05.exercise;

public class Car {
    String model;
    String make;
    private static int numberOfCars = 0;

    public Car(String model, String make) {
        this.model = model;
        this.make = make;
        this.setNumberOfCars();
        System.out.println(this);
    }
    public int getNumberOfCarss(){
        return numberOfCars;
    }
    public void setNumberOfCars(){
        this.numberOfCars ++;
    }
    public String toString(){
        return "자동차 1대 생산, 누적 생산량 = " + this.getNumberOfCarss() + "대";
    }

    public static void main(String[] args) {
        Car c1 = new Car("캠리", "토요타");
        Car c2 = new Car("그랜저", "현대");
        Car c3 = new Car("K7", "기아");
    }
}
