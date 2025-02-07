package day02_0204;

public non-sealed class Manger extends Person {
    // non sealed를 하면 봉인해제이므로 상속을 할 수 있다.
    @Override
    public void work() {
        System.out.println("생산관리을 한다.");

    }
}
