package day01_0203;

public class Phone {
    public String model;
    public String color;

    //생성자 선언
    //public Phone(){}
    public Phone(String model,String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone (model,color) 생성자 실행");
    }

    public void bell(){
        System.out.println("벨이 울린다.1");
    }


}
