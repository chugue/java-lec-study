package ex06;

class Student {
    private int number;
    protected String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }
}
public class GraduateStudent extends Student{
    public String lab;

    public GraduateStudent(int number, String name, String lab) {
        super(number, name);
        this.lab = lab;
    }
}

