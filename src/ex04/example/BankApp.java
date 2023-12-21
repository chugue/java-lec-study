package ex04.example;

import ex04.example.model.Account;
import ex04.example.model.User;

public class BankApp {
    public static void main(String[] args) {
        // 고객 2명 생성
        User u1 = new User(1, "ssar", "ssar@nate.com");
        User u2 = new User(2, "cos", "cos@nate.com");

        Account a1 = new Account(1111,1000L, 1);
        Account a2 = new Account(2222,1000L, 2);

        int amount = 1100;
        int sender = 1111;
        int reieber =222;


        if ( amount < amount){
            System.out.println("0원 이하 금액을 이체 할 수 없습니다.");
            return;
        }
//        /잔액검증git
        if (a1.balance < amount) {
            System.out.println("잔액부족");
        }

        a1.balance = a1.balance - amount;
        a2.balance = a2.balance - amount;

        System.out.println(a1);
        System.out.println(a2);
    }
}
