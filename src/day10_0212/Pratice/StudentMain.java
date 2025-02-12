package day10_0212.Pratice;

//import day10_0212.lamdaPra.ListEx.User;

import java.util.*;

public class StudentMain {
    static Scanner in  = new Scanner(System.in);
    public static void main(String[] args) {
        //int total = 0;
        List<SeoulStudent> user = new ArrayList<>();

        System.out.print("학생 수를 입력하세요 : ");
        int studentCount = in.nextInt();
        in.nextLine();  // 개행 문자 제거

        SeoulStudent[] students = new SeoulStudent[studentCount];

        for(int i = 0; i < studentCount;i++){
            int total = 0;
            System.out.println("국어를 입력하세요");
            int kor = in.nextInt();
            total += kor;
            System.out.println("수학를 입력하세요");
            int mat = in.nextInt();
            total += mat;
            System.out.println("영어를 입력하세요");
            int eng = in.nextInt();
            total += eng;
            in.nextLine();
            System.out.println("이름을 입력하세요");
            String n = in.nextLine();

            System.out.println("학번을 입력하세요");
            int sno = in.nextInt();


            students[i] = new SeoulStudent(n,sno,kor,eng,mat,total);
            user.add(students[i]);


            //students = new SeoulStudent[i]{new SeoulStudent(n, sno, kor, mat, eng)};


        }



//        for(SeoulStudent s : students){
//            System.out.println("학생이름 : " + s.name + " 학생 학번 : "+ s.sno + " 국어점수 : " + s.korea + " 영어점수 : "+ s.english + " 수학점수 : "+ s.math + " 평균 : " + (s.total)/3);
//
//        }
        Collections.sort(user, Comparator.comparing(SeoulStudent::getTotal));//성적순
        for(SeoulStudent seoul : user) System.out.println("학생이름 : " + seoul.name + " 학생 학번 : "+ seoul.sno + " 국어점수 : " + seoul.korea + " 영어점수 : "+
                seoul.english + " 수학점수 : "+ seoul.math +
                " 평균 : " + (seoul.total)/3);


        System.out.println("-------------------------------------------");


        Collections.sort(user, Comparator.comparing(SeoulStudent::getName));//이름순
        for(SeoulStudent seoul : user) System.out.println("학생이름 : " + seoul.name +
                " 학생 학번 : "+ seoul.sno + " 국어점수 : " + seoul.korea + " 영어점수 : "+
                seoul.english + " 수학점수 : "+ seoul.math +
                " 평균 : " + (seoul.total)/3);

        System.out.println("===============================");



        Collections.sort(user, Comparator.comparing(SeoulStudent::getSno));// 학번순
        for(SeoulStudent seoul : user) System.out.println("학생이름 : " + seoul.name + " 학생 학번 : "+
                seoul.sno + " 국어점수 : " + seoul.korea + " 영어점수 : "+
                seoul.english + " 수학점수 : "+ seoul.math +
                " 평균 : " + (seoul.total)/3);
        System.out.println("===============================");

        Collections.sort(user,Comparator.comparing(SeoulStudent::getMath));// 과목 수학 순서
        for(SeoulStudent seoul : user) System.out.println("학생 이름 : " + seoul.name  + "학생 학번 : " +
                seoul.sno + "국어 점수 : "+ seoul.korea + " 영어점수 : "+
                seoul.english + "수학점수 : "+ seoul.math  +
                " 평균 : " + (seoul.total/3));

//        SeoulStudent s1 = new SeoulStudent();
//        System.out.println("국어를 입력하세요.");
//        int a = in.nextInt();
//        s1.setKorea(a);
//
//        System.out.println("영어를 입력하세요.");
//
//        int b = in.nextInt();
//        s1.setEnglish(b);
//        System.out.println("수학를 입력하세요.");
//
//        int c = in.nextInt();
//        s1.setMath(c);
//
//        in.nextLine();
//
//        System.out.println("이름을 입력하세요.");
//        String d = in.nextLine();  // 이제 정상적으로 입력됨
//        s1.setName(d);
//
//        System.out.println("학번을 입력하세요.");
//        int e = in.nextInt();
//        s1.setSno(e);
//
//
//
//        System.out.println(s1.name);
//        System.out.println(s1.sno);
//        System.out.println(s1.korea);
//        System.out.println(s1.math);
//        System.out.println(s1.english);

    }
}
