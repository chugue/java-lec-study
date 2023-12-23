package ex04.test.excercise;

public class Date {
    int year;
    String month;
    int cdate;

    public Date(int year, String month, int cdate) {
        this.year = year;
        this.month = month;
        this.cdate = cdate;
    }

    public void print1(){
        System.out.println(year + "."+ month + "." + cdate );
    }
    public void print2(){
        System.out.println(month + " " + cdate + ", " + year  );
    }

    public static void main(String[] args) {
        Date d1 = new Date(2022, "9", 5);
        Date d2 = new Date(2022, "September", 5);

        d1.print1();
        d2.print2();
    }
}
