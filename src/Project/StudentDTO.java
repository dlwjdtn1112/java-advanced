package Project;

public class StudentDTO {
    String sno;
    String name;
    int korean;
    int english;
    int math;
    int science;
    int total;
    float average;
    String grade;

    public StudentDTO(String sno, String name, int korean, int english, int math, int science) {
        this.sno = sno;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.science = science;
        this.total = korean + english + math + science;
        this.average = total / 4.0f;
        this.grade = calculateGrade(this.average);
    }

    private String calculateGrade(float average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }
}
