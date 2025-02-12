package day09_0211.Generic.ex03.extend;

import java.util.List;

public class NumberBox <T extends Number>{
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public double doubleValie(){
        return number.doubleValue();
    }
// 상한제한 와일드카드(? extends T) 알려지지 않은 유형이 특정 타입
     public void printNumberList(List<? extends Number> list){
        //Iterable<? extends Number> list = null;
        for(Number number : list){
            System.out.println(number);
        }
    }
// 어떤 유형과도 함께 사용할 수 있도록 유연성 제공
    public void printList(List<?> list){
        for(Object element : list) System.out.println(element);

    }
    //하한 제한 와일드 카드 (? super T) 특정 타입 또는 그 상위 클래스 중 하나를 허용
    public void addNumber(List<? super Integer>list){
        list.add(100);
    }

}


