package ex04.test.excercise;

public class Movie {
    String name;
    String director;
    int year;
    String actor;
    double grade;

    public Movie(String name, String director, int year, String actor, double grade) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.actor = actor;
        this.grade = grade;
    }

    public String toString(){
        System.out.println("제목 : " + name);
        System.out.println("감독 : " + director);
        System.out.println("연도 : " + year);
        System.out.println("배우 : " + actor);
        System.out.println("평점 : " + grade);
        return null;
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("티파니에서 아침을", "블레이크 에드워즈", 1962, "오드리 햅번", 8.43);

        m1.toString();
    }
}
