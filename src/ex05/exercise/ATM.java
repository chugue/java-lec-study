package ex05.exercise;

import java.util.ArrayList;
import java.util.Scanner;

class Account {
    int accountNum;
    int balance;
    public Account(int accountNum) {
        this.accountNum = accountNum;
        this.balance = 0;
    }
    public int deposit(int amount){
        this.balance = this.balance + amount;
        return balance;
    }
    public int cashout(int amount){
        this.balance = this.balance - amount;
        return balance;
    }
    public void transfer(int amount, ex05.exercise.Account other) {
        this.balance = this.balance - amount;
        other.balance = other.balance + amount;
    }
}
public class ATM {
    public static int amount;
    static public void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList();
        Scanner sc = new Scanner(System.in);
        accounts.add(new Account(1012222));
        accounts.add(new Account(1010000));

        System.out.print("PIN을 입력하시오 : ");
        int pin = sc.nextInt();
        if (pin == 1234) {
            while (true) {
                System.out.println("1. 현금 입금");
                System.out.println("2. 현금 인출");
                System.out.println("3. 계좌 이체");
                System.out.println("4. 종료");
                System.out.print("번호를 선택하세요 : ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("입금액 : ");
                        amount = sc.nextInt();
                        accounts.get(0).deposit(amount);
                        System.out.println("현재 잔액은 : " + accounts.get(0).balance + "입니다.");
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("인출액 : ");
                        amount = sc.nextInt();
                        if (amount < accounts.get(0).balance) {
                            accounts.get(0).cashout(amount);
                            System.out.println("현재 잔액은 : " + accounts.get(0).balance + "입니다.");
                        } else {
                            System.out.println("잔액이 부족합니다.");
                        }
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("이체액 : ");
                        amount = sc.nextInt();
                        if (amount < accounts.get(0).balance) {
                            System.out.print("이체 계좌 번호 : ");
                            int otherNum = sc.nextInt();
                            Account other = null; // for구문에서 찾은 객체를 저장할 공간 선언.
                            for (Account name : accounts){
                                if (name.accountNum == otherNum){
                                    other = name;// account넘버가 같은 name 객체를 other변수에 지정.
                                    break;
                                }
                            }
                            if (other != null) {
                                accounts.get(0).transfer(amount, other);
                                System.out.println("이체되었습니다.");
                            } else {
                                System.out.println("이체할 계좌를 찾을 수 없습니다.");
                            }
                        } else {
                            System.out.println("잔액이 부족합니다.");
                        }
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("시스템이 종료됩니다.");
                        System.out.println();
                        return;
                    default:
                        System.out.println("잘못된 입력입니다.");
                        System.out.println();
                        break;
                }
            }
        } else {
            System.out.println("비밀번호를 잘못 입력하셨습니다.");
        }
    }
}

