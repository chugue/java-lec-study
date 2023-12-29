package ex07.excercise;

interface GetInfo{
    double getValue();
}
public class Student implements GetInfo{
    double grades;

    public Student(double grades) {
        this.grades = grades;
    }
    @Override
    public double getValue() {
        return this.grades;
    }
    public static double average (GetInfo[] objects){
        double sum = 0;
        for (int i = 0; i < objects.length; i++) {
            sum = sum + objects[i].getValue();
        }
        return  sum/objects.length;
    }
    public static void main(String[] args) {
        GetInfo[] objects = new GetInfo[]{
                new Student(70.0),
                new Student(60.0),
                new Student(80.0),
                new Student(90.0),
                new Student(100.0)
        };
        double avg = Student.average(objects);
        System.out.println("학생들의 평균 점수는 : " + avg);
    }

}

