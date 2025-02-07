package day01_0203.SHAPE;

public class StudentMain {
    public static void personInfo(Person person){
        System.out.println("name : " + person.name);
        person.running();
        if(person instanceof Student){
            System.out.println("학번은 "+ ((Student)person).studentNo);
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person("신세계");
        personInfo(p1);
        //Sysgittem.out.println();

        Person p2 = new Student("신동현",1234456);
        personInfo(p2);

    }
}
