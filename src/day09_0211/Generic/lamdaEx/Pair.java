package day09_0211.Generic.lamdaEx;
//Pair클래스는 두개의 타입매개변수 T,U를 자긴 제너릭 클래스마다,서로 다룬 타입의 두 객체를 가진다.
public class Pair<T,U> {
    private T first;
    private U eecond;

    public Pair(){}

    public Pair(T first, U eecond) {
        this.first = first;
        this.eecond = eecond;
    }


    public T getFirst() {
        return first;
    }

    public U getEecond() {
        return eecond;
    }
}
