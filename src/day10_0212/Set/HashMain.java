//package day10_0212.Set;
//
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//
//public class HashMain {
//    public static void main(String[] args) {
//        Set<Member> members = new HashSet<>();
//
//
//        members.add(new Member("홍길동1",30));
//        members.add(new Member("홍길동2",30));
//        members.add(new Member("홍길동3",234));
//        members.add(new Member("홍길동4",32340));
//        members.add(new Member("홍길동5",30));
//
//        System.out.println(members.size());
//
//        for(Member member : members){
//            Iterator<Member> iterator =  members.iterator();
//            while(iterator.hasNext()){
//                Member member1 = iterator.next();
//                System.out.println(member1.name + " " + member1.age);
//                iterator.remove();
//                int size = members.size();
//                System.out.println("현재 회원 수 : " +size);
//            }
//
//        }
//
//
//    }
//
//}
