package day08_0210.SingletonExample;

public class Main {
    public static void main(String[] args) {
        SingleExample a = SingleExample.getInstance();
        SingleExample b = SingleExample.getInstance();

        System.out.println(a == b);

        a.showMessage();

    }
}
