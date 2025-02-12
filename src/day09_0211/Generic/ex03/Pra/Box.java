package day09_0211.Generic.ex03.Pra;
//어떤 타입의 객체든 저장할 수 있는 제너릭 클래스 Box를 구현하세요. 객체를 설정하고 가져오는 메소드를 구현하라.

import java.util.List;

public class Box <T extends Number>{
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public double doubleValue(){
        return number.doubleValue();
    }

    public void printNumberList(List<? extends Number> list){
        for(Number number : list){
            System.out.println(number);
        }

    }
    //다양한 데이터 타입이 가능하다.
    public void printList(List<?> list){
        for(Object element : list) System.out.println(element);
    }

    public void addString(List<? super String>list){
        list.add("33");

    }
    public void addNumber(List<? super Integer>list){
        list.add(200);

    }
    public void addDouble(List<? super Double>list){
        list.add(89.2);
        list.add(90.2);
        list.add(88.7);
        list.add(92.2);

    }

    public void addChar(List<? super Character>list){
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');

    }
}
