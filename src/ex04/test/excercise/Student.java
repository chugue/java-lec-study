package ex04.test.excercise;

public class Student {
    String name;
    private String rollno;
    int age;

    public Student(String name, String rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }
    public void print (){
        System.out.println("학생의 이름 : " + name);
        System.out.println("학생의 학번 : " + rollno);
        System.out.println("학생의 나이 : " + age);
        System.out.println("Student 객체가 생성되었습니다.");
    }
    public static void main(String[] args) {
        Student s1 = new Student("Kim","0001", 20);
        s1.print();
    }
}
