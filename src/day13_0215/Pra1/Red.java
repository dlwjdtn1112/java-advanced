package day13_0215.Pra1;

public class Red {
    String name;
    int age;
    String birthday;

    public Red(String name, int age, String birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    public Red(){}

    public void display(){
        System.out.println("이름은 : " +  this.name + " 나이는 : " + this.age + " 생일은 : "+ this.birthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
