package day04_0206.Multi_in;

public class Main {
    public static void main(String[] args) {

        interfaceA b = new B();
        interfaceA c = new C();

        if(b instanceof B){
            b.method1();
        }

        if(c instanceof C){
            ((C) c).method2();
        }
        System.out.println("-----------------------");
        action(b);
        action(c);

    }

    static void action(interfaceA i){
        if (i instanceof C){
            ((C)i).method2();
        }


        else if(i instanceof B){
            i.method1();
        }

    }

}
