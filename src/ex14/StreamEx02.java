package ex14;

import java.util.ArrayList;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StreamEx02 {
    public static void main(String[] args) {
        // User 3명 만들기
        ArrayList<User> list = new ArrayList<User>();
        list.add(new User("홍길동",20));
        list.add(new User("장보고",15));
        list.add(new User("임꺽정",30));

        list.stream().map(u -> {
            System.out.println(u.getAge()-1);
            return u;
        } ).toList();
        list.stream().forEach(user -> {
            System.out.println(list);
        });


    }
}