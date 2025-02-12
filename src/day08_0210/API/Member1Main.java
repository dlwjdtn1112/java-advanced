package day08_0210.API;

public class Member1Main {
    public static void main(String[] args) {
        Member1 m1 = new Member1("shin",25);
        System.out.println(m1.name());
        System.out.println(m1.age());
        System.out.println(m1.toString());

        Member1 m2 = new Member1("shin",25);

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        System.out.println(m1.equals(m2));


    }
}
