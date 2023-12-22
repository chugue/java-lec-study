package ex04;

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
    }
}
