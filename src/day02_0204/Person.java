package day02_0204;

public sealed class Person permits Employee,Manger {
    public String name;

    public void work(){
        System.out.println("하는 일이 결정X");
    }
}
