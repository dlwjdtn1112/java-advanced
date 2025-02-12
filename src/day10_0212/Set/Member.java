package day10_0212.Set;

public class Member {
    public String name;
    public int age;


    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        //name과 age가 같다면 true리턴을 한다.
        if(obj instanceof Member target){
            return target.name.equals(name) && (target.age == age);
        }
        else return false;

    }

    @Override
    public int hashCode() {
        //name과 age 값이 같으면 동일한 hashCode가 리턴한다.
        return name.hashCode() + age;
    }
}
