package ex05.exercise;
import java.util.Scanner;

public class Contacts {
    String name;
    String tel;
    String email;
    public static int count;

    public Contacts(String name, String tel, String email) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        count++;
    }
    public static int getCount(){
        return count;
    }
    public String toString(){
        return "이름과 전화번호, 이메일을 입력하시오 : " + this.name +" " + this.tel + " " + this.email;
    }

    public static void main(String[] args) {
        Contacts[] contacts = new Contacts[100];
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (true){
            System.out.println("연락처를 입력하세요(종료 -1)");
            System.out.print("이름을 입력하세요 : ");
            String name = sc.nextLine();
            if (name.equals("-1")){
                break;
            }else {
                System.out.print("전화번호를 입력하세요 : ");
                String tel = sc.nextLine();
                System.out.print("이메일을 입력하세요 : ");
                String email = sc.nextLine();

                contacts[i]= new Contacts(name, tel, email);
                System.out.println("\n");
                i++;
            }
        }
        for(Contacts a : contacts){
            if (a != null) {
                System.out.println(a);
            } else {  break; }
        }
        System.out.print("지인들의 수는 " + contacts[i].getCount()+ "명 입니다.");
        System.out.println("\n");


        sc.close();
    }
}
