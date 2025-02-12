package day10_0212.lamdaPra.ListEx;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student>{

    private int sno;
    private String name;

//학번 정렬 후 같은 학번일 경우 이름수능로 오름차순
    @Override
    public int compareTo(Student o) {
//        if(this.sno > o.sno){return 1;}
//        else if(this.sno == o.sno) return 0;
//        else return -1;
        return this.sno > o.sno ? 1:0;


    }

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }
}
