package day07_0209.Animal;

public class Dog implements Animal{
    String name;
    int age;
    int amount = 1;


    Dog(String name,int age){
        this.name = name;
        this.age = age;
        getAmount();
    }


    public void move(){
        System.out.println( age+"세 " +name + "가 이동을 합니다");
    }
    public void makesound(){
        System.out.println(age+"세 "+ name + "멍멍 ");
    }
    public int getAmount(){
        amount += 1;
        return amount;
    }
}
