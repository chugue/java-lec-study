package ex04.example2.model;

public class Account {
    private final int id;
    private long balance;
    private int userId;

    public boolean 잔액부족하니(long amount){
        if(balance < amount) {
            return true;
        }
        return false;
    }

    // 객체 상태를 변경, 객체의 상태를 확인
    public void 출금(long amount){
        this.balance = this.balance - amount;
    } //메서드는 하나의 책임만 가지는 것이 이상적이다.

    public void 입금(long amount){
        this.balance = this.balance + amount;
    }



    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
