package day10_0212.lamdaPra.ListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User implements Comparable<User>{
    String name;
    int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    @Override
    public String toString() {
        return "이름 : " + name+ "나이 : "+ age;
    }
}


public class Main {
    public static void main(String[] args) {

        User u1 = new User("이정수",19);
        User u2 = new User("김정수",20);
        User u3 = new User("최문",11);
        User u4 = new User("허씨",34);
        User u5 = new User("장씨",23);

        List<User> user = new ArrayList<>();
        user.add(u1);
        user.add(u2);
        user.add(u3);
        user.add(u4);
        user.add(u5);
        Collections.sort(user, Comparator.comparing(User::getAge));
        for(User u : user) System.out.println(u.name + " " + u.age + "세" );

        System.out.println("---------------------");

        Collections.sort(user, Comparator.comparing(User::getName));
        for(User u : user) System.out.println(u.name + " " + u.age + "세" );

        System.out.println("---------------------");

        Collections.sort(user, Comparator.comparing(User::getAge).thenComparing(User::getName));
        for(User u : user) System.out.println(u.name + " " + u.age + "세" );

    }
}
