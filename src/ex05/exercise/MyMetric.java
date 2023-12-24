package ex05.exercise;

class MyMetricTest{
    int kilo;
    double mile;

    public void mileToKilo (double mile){
        this.mile = mile;
        this.kilo = (int)(mile / 1.6213881811967936);
    }
}
public class MyMetric {
    int kilo;
    double mile;

    public void kiloToMile (int kilo){
        this.kilo = kilo;
        this.mile = kilo * 0.6213881811967936;
    }
    public String toString(){
        return kilo + "km를 마일로 바꾸면 " + mile;
    }
    public static void main(String[] args) {
        MyMetric m = new MyMetric();
        m.kiloToMile(1);
        System.out.println(m);
    }
}
