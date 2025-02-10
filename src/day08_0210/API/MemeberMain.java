package day08_0210.API;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MemeberMain {


    public static void main(String[] args) {
        Member m1 = new Member("신세계");
        //Member m4 = m1;
        Member m2 = new Member("신세계");
        Member m3 = new Member("신세계2");
        //Member m3 = new Member("ssg3");
    //컴퓨터 관점
        System.out.println(m1 == m2); //주소를 비교 false
        System.out.println(m1.equals(m2)); // Object equals() 주소값을 비교

        //사용자 관점

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        List<Member> members = new ArrayList<Member>();
        members.add(m1);
        members.add(m2);
        members.add(m3);
        //members.remove(m2);
        System.out.println("현재 배열의 길이 : " + members.size());


        for(Member i : members){
            System.out.println(i.name);
            //System.out.println();
        }

        System.out.println("--------");

        Set<Member> members1 = new HashSet<>();

        members1.add(m1);
        members1.add(m2);
        members1.add(m3);

        for(Member m : members1){
            System.out.println(m.name);
        }




    }

//    @Override
//    public int hashCode() {
//        return Object.hash(name);
//    }
}
