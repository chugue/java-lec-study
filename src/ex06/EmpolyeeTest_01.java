package ex06;

class Date {
    private int year, month, date; // birth(1990,1,1)

    public Date(int year, int month, int date) { // birth(1990,1,1)
        this.year = year;
        this.month = month;
        this.date = date;
    }
    public String toString(){
        return "Date [year=" + year + ", month=" + month + ", date=" + date + "]";
    }
}
class Employee_01 {
    private String name;
    private Date birthDate;

    public Employee_01(String name, Date birthDate){ //employee(홍길동,@birth)
        this.name = name;
        this.birthDate = birthDate;
    }
    public String toString() {
        return "Employee [name =" + name + ", birthDate =" + birthDate + "]";
    }
}

public class EmpolyeeTest_01 {
    public static void main(String[] args) {
        Date birth = new Date(1990, 1, 1); //birth(1990,1,1)
        Employee_01 employee = new Employee_01("홍길동", birth); //employee(홍길동,@birth)
        System.out.println(employee); // (홍길동,@birth)
    }

}
