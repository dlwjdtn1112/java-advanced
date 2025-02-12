package day10_0212.lamdaPra.ListEx;

public class StudentMain {
    public static void main(String[] args) {
        Student 철수 = new Student(132425,"김철수");
        Student 영희 = new Student(13234,"최영희");

        int isBig = 철수.compareTo(영희);
        System.out.println(isBig);
    }
}
