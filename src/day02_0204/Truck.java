package day02_0204;

public  class Truck extends Wheeler{
    public Truck(String carName, int velocity, int wheelNumber) {
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        int v = speed*5;
        velocity += v;
        if(velocity>100) {
            velocity = 100;
        }
        System.out.println(carName +"의 현재 속도는 "+ velocity+"입니다.");
    }

    @Override
    public void speedDown(int speed) {
        int v = speed*5;
        velocity -=v;
        if(velocity<50) {
            velocity = 50;
            System.out.println(carName+ "최저속도위반으로 속도를 "+ velocity+"으로 올립니다.");
        } else {
            System.out.println(carName +"의 현재 속도는 "+ velocity+"입니다.");
        }
    }

    @Override
    public void wheelNumber() {
        System.out.println(carName+" : " + "바퀴 "+ wheelNumber+ "개입니다.");
    }

}
