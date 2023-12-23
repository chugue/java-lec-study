package ex04.test.excercise;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String toString(){
        return "Dog [개의 이름 : " + name +", 나이 : "+ age + ", 종류 : " + breed + "]";
    }
    public void barking () {
        System.out.println("짖음");
    }
    public static void main(String[] args) {
        Dog d1 = new Dog("orange", "york",1);
        System.out.println(d1.toString());
        d1.barking();
    }
}
