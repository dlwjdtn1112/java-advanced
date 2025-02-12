package day09_0211.Generic.lamdaEx;

//Transformer 제네릭 함수형 인터페이스 정의
@FunctionalInterface
public interface Transfermer<T,R> {
    R transfer(T input);

}
