package day09_0211.Generic.ex01;

public class Box<T> { // T는 박스안에 인스턴스를 생성할 때 어떤 참조타입으로 대체될 수 있는 타입매개변수
    private T item;
    private int count;

    public T getItem(){
        return item;
    }
    public void setItem(T item){
        this.item = item;
        count ++;
    }
}
