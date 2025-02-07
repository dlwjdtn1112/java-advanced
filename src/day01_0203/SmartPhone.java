package day01_0203;

public class SmartPhone extends Phone{

    public boolean wifi;

    public SmartPhone(String model,String color){
        super(model,color);
//        this.model = model;
//        this.color = color; //phone으로부터 받은 필드
    }

    public void setWifi(boolean wifi){
        this.wifi = wifi;
        if(this.wifi != false) internet();
    }

    public void internet(){
        System.out.println("인터넷을 연걸한다.");
    }

    public void bell(){
        System.out.println("기본 벨소리");
        super.bell();
        System.out.println("아아아아악");
    }

}
