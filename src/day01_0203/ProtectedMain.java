package day01_0203;
class A{
    protected String field1;
    public A(){}

    protected A(String field1){
        this.field1 = field1;
    }

    protected void method1(){
        System.out.println("A클래스 !!");
    }
}
class B{
    protected String field2;
    protected B(){}

    protected B(String field2){
        this.field2 = field2;
    }

    protected void method1(){
        System.out.println("B클래스 !!");
        A  a = new A();
        a.field1 = "v1";
        a.method1();
    }

}

public class ProtectedMain {
}
