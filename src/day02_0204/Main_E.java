package day02_0204;

public class Main_E {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();
        Manger manger = new Manger();
        Student student = new Student();
        person.work();
        employee.work();
        manger.work();
        student.work();
    }
}
