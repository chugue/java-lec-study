package ex06.example3;

public class Dark {
    String name;

    public Dark(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("다크템플러가 공격합니다." + name);
    }
}
