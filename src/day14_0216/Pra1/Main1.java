package day14_0216.Pra1;

class A{
    static int count;
    void checkCount(){
        count++;
        System.out.println("현재 수 : " + count);
    }
}






public class Main1 {
    public static void main(String[] args) {
        A a1  = new A();
        A a2  = new A();

        a1.checkCount();
        a1.checkCount();
        a1.checkCount();
        a2.checkCount();
        a2.checkCount();
        a2.checkCount();



    }

}
