package day09_0211.Generic.lamdaEx;

public class CourseMain {
    public static void main(String[] args) {
        //모든 사람이 신청가능
        Course.registerCourse(new Application<Person>(new Person()));
        Course.registerCourse(new Application<Worker>(new Worker()));
        Course.registerCourse(new Application<Student>(new Student()));
        Course.registerCourse(new Application<HighStudent>(new HighStudent()));
        Course.registerCourse(new Application<MiddleStudent>(new MiddleStudent()));
        System.out.println("==========================================");

        // 학생만 신청가능
        Course.registerCourse2(new Application<MiddleStudent>(new MiddleStudent()));
        Course.registerCourse2(new Application<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Application<Student>(new Student()));

        //직장인과 일반인 신청가능
        Course.registerCourse3(new Application<Person>(new Person()));
        Course.registerCourse3(new Application<Worker>(new Worker()));
        //Course.registerCourse3(new Application<Worker>(new Student()));

    }
}
