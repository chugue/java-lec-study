package ex04.test.excercise;

public class Person {
    String name;
    private String mobile;
    private String office;
    private String email;

    public Person(String name, String mobile, String office, String email) {
        this.name = name;
        this.mobile = mobile;
        this.office = office;
        this.email = email;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Person[이름 : " + name + ", mobile : "+ mobile + ", office : "+ office + ", email : "+ email + "]";
    }
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", "111-1111-1111", "주소", "이메일");
        p1.getName();
        System.out.println(p1.toString());
        p1.setName("김철수");
        System.out.println(p1.toString());

    }

}
