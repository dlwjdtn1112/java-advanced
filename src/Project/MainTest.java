package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// 1. 파일 입출력 관련 (현재는 구현 생략)

interface StudentIO {
    void saveStudentData(List<StudentDTO> students);
    void loadStudentData(List<StudentDTO> students);
}


// 2. 학생정보 입력용

interface StudentInput {
    void input(StudentDTO student);
}


// 3. 학생정보 출력용

interface StudentOutput {
    void printStudentDTO(StudentDTO student);
}


// 4. 검색 기능

interface Search {
    StudentDTO search(String sno);
}


// 5. 정렬 기능

interface SortedStudent {
    double GRADE = 4.5;

    void sortAverage();
    void sortSno();
}


// 6. 학생 DTO

class StudentDTO {
    private String sno;     // 학번
    private String name;    // 이름
    private int korean;
    private int english;
    private int math;
    private int science;
    private float total;
    private float average;
    private String grade;

    // 생성자
    public StudentDTO(String sno, String name,
                      int korean, int english, int math, int science) {
        this.sno = sno;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.science = science;
        calcTotalAndAverage();
        calcGrade();
    }

    // 내부 계산 메서드
    private void calcTotalAndAverage() {
        this.total = korean + english + math + science;
        this.average = total / 4.0f;
    }

    private void calcGrade() {
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }


    public void setScores(int korean, int english, int math, int science) {
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.science = science;
        calcTotalAndAverage();
        calcGrade();
    }

    // getter (필요하다면 setter 추가)
    public String getSno() { return sno; }
    public String getName() { return name; }
    public float getAverage() { return average; }
    public String getGrade() { return grade; }
}


// 7. 싱글턴 패턴의 StudentManager


class StudentManager
        implements StudentInput, StudentOutput, Search, SortedStudent
{
    // 싱글턴 인스턴스
    private static StudentManager instance = new StudentManager();

    // 학생 정보를 저장할 List (또는 배열)
    private List<StudentDTO> students = new ArrayList<>();

    // private 생성자
    private StudentManager() {}

    // 외부에서 싱글턴 객체 획득
    public static StudentManager getInstance() {
        return instance;
    }


    // (A) StudentInput 구현

    @Override
    public void input(StudentDTO student) {
        // 추가
        students.add(student);
    }


    // (B) StudentOutput 구현

    @Override
    public void printStudentDTO(StudentDTO student) {
        if (student == null) {
            System.out.println("학생 정보가 없습니다.");
        } else {
            System.out.println(
                      "학번: " + student.getSno()
                    + ", 이름: " + student.getName()
                    + ", 평균: " + student.getAverage()
                    + ", 학점: " + student.getGrade());
        }
    }


    // (C) Search 구현

    @Override
    public StudentDTO search(String sno) {
        for (StudentDTO s : students) {
            if (s.getSno().equals(sno)) {
                return s;
            }
        }
        return null;
    }


    // (D) SortedStudent 구현

    @Override
    public void sortAverage() {
        Collections.sort(students,
                Comparator.comparingDouble(StudentDTO::getAverage));
    }

    @Override
    public void sortSno() {
        Collections.sort(students,
                Comparator.comparing(StudentDTO::getSno));
    }


    // Create
    public boolean create(StudentDTO student) {
        // 이미 존재 하는 학번인지 확인
        if (search(student.getSno()) != null) {
            // 학번 중복 시 실패 처리
            return false;
        }
        // 중복이 아니면 추가
        students.add(student);
        return true;
    }

    // Read
    public StudentDTO read(String sno) {
        // 기존 search 활용
        return search(sno);
    }

    // Update: 점수만 새로 넣는다고 가정
    public boolean update(String sno, int newKorean, int newEnglish, int newMath, int newScience) {
        StudentDTO target = search(sno);
        if (target != null) {
            target.setScores(newKorean, newEnglish, newMath, newScience);
            return true;
        }
        return false;
    }

    // Delete
    public boolean delete(String sno) {
        StudentDTO target = search(sno);
        if (target != null) {
            students.remove(target);
            return true;
        }
        return false;
    }


    // 학생 목록 전체를 반환

    public List<StudentDTO> getStudents() {
        return students;
    }
}



public class MainTest {
    public static void main(String[] args) {


        StudentManager manager = StudentManager.getInstance();


        boolean c1 = manager.create(new StudentDTO("20250001", "이정수1", 90, 95, 85, 100));
        boolean c2 = manager.create(new StudentDTO("20250002", "이정수2", 70, 75, 80, 60));
        boolean c3 = manager.create(new StudentDTO("20250003", "이정수3", 100, 100, 90, 95));
        boolean c4 = manager.create(new StudentDTO("20250004", "이정수4", 50, 50, 50, 50));
        //boolean c5 = manager.create(new StudentDTO("20250004", "이정수5", 50, 50, 50, 50));


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        //System.out.println(c5);


        // 2) Read 예시 (학번으로 조회)


        System.out.println("[Read 결과]");
        StudentDTO found = manager.read("20250001");
        manager.printStudentDTO(found);
        // 없는 학번 조회
        StudentDTO notFound = manager.read("99999999");
        manager.printStudentDTO(notFound);
        System.out.println();


        // 3) Update 예시

        System.out.println("[Update 결과]");
        boolean u1 = manager.update("20250001", 0, 93, 100, 85);
        boolean u2 = manager.update("99999999", 50, 50, 50, 50); // 없는 학번
        System.out.println("20250001 업데이트: " + u1);
        System.out.println("99999999 업데이트: " + u2);
        // 변경 후 다시 확인
        manager.printStudentDTO(manager.read("20230001"));
        System.out.println();


        // 4) Delete 예시

        System.out.println("[Delete 결과]");
        boolean d1 = manager.delete("20250001");
        boolean d2 = manager.delete("99999999");
        System.out.println("20250001 삭제: " + d1);
        System.out.println("99999999 삭제: " + d2);
        System.out.println("삭제 후 20250001 조회: ");
        //System.out.println("구분");
        manager.printStudentDTO(manager.read("20250001"));
        System.out.println();


        // 5) 정렬 후 전체 확인 (정렬/출력 예시)

        manager.sortSno();
        System.out.println("[학번 기준 오름차순 정렬]");
        for (StudentDTO s : manager.getStudents()) {
            manager.printStudentDTO(s);
        }
        System.out.println();

        manager.sortAverage();
        System.out.println("[평균 기준 오름차순 정렬]");
        for (StudentDTO s : manager.getStudents()) {
            manager.printStudentDTO(s);

        }
    }
}
