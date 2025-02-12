package day09_0211.Generic.lamdaEx;

public class Course {

    // Person(사람) 이면 수강등록 가능
    public static void registerCourse(Application<?> application){
        System.out.println(application.kind.getClass().getSimpleName() + "이 course1을 등록함");
    }

    // 학생만 등록가능
    public static void registerCourse2(Application<? extends Student>application){
        System.out.println(application.kind.getClass().getSimpleName() + "이 course2을 등록함");
    }

    // 직장인 및 일반인만 등록가능
    public static void registerCourse3(Application<? super Worker>application){
        System.out.println(application.kind.getClass().getSimpleName() + "이 course3을 등록함");
    }

}
