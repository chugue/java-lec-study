package ex04;

<<<<<<< HEAD
class A {
    private int a;
    int b;
    public int c;
}

public class Test {
    public static void main(String[] args) {
        A obj = new A();

//        obj.a = 10; // 다른 클래스에서 private은 접근 하지 못함
        obj.b = 20; // 디폴트 멤버는 접근 가능
        obj.c = 30; // 공용 멤버는 접근할 수 있음.
=======
class Employee {
    public int baseSalary = 3000000;

    int getSalary() {
        return baseSalary;
    }
}
class Manager extends Employee {
    @Override
    int getSalary() {
        return (baseSalary + 2000000);
    }
}
//class Programmer extends Employee {
//    int getSalary()
//}

public class Test {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자의 월급 : " + obj.getSalary());

        Programmer obj2 = new Programmer();
        System.out.println("프로그래머의 월급 : " + obj2.getSalary());
>>>>>>> 958e37c4b2882e8c86bc3cd3a7a09f8ce660884e
    }
}
