package ex04.example2;

import ex04.example2.model.Account;
import ex04.example2.model.User;

public class BankApp {
    public static void main(String[] args) {
        // 1. 고객 2명 만들기
        User ssar = new User(1, "ssar", "ssar@gmail.com");
        User cos = new User(2, "cos", "cos@gmail.com");
        User love = new User(3, "love", "love@gmail.com");

        // 2. 계좌 2개 만들기
        Account ssarAccount = new Account(0001, 1000L, 1);
        Account cosAccount = new Account(0002, 1000L, 2);
        Account loveAccount = new Account(0003, 1000L, 3);

        // 3. 고객에게 정보를 받기 (sender, receiver, amount)
        long amount = 100L;

        //4. 이체 (ssar -> cos 1000원)
        BankService.이체(ssarAccount, cosAccount, amount);
        BankService.이체(ssarAccount, loveAccount, amount);
        BankService.이체(cosAccount,loveAccount,amount);


        System.out.println(ssarAccount);
        System.out.println(cosAccount);
        System.out.println(loveAccount);

        //8.

        ssarAccount.출금(amount);
        loveAccount.출금(amount);
    }
}
