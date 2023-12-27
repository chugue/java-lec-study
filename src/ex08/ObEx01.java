package ex08;

class Account extends Object{
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "안녕";
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1111, 1000);
        Account account2 = new Account("임꺽정", 2222, 1000);
        System.out.println(account);
        System.out.println(account.getClass());
        System.out.println(account.hashCode());

        //메모리값 비교, (주소비교)
        if (account == account2){
            System.out.println("가탕요?");
        }
        //account -> equals (오브젝트) (주소비교)
        //account.toString -> equals (주소비교 and 값비교)



    }
}
