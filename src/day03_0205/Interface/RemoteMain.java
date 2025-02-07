package day03_0205.Interface;

public interface RemoteMain {

    public static void main(String[] args) {
        remote_controller rc;
        rc = new Tv(); //인터페이스 자신을 구현한 구현객체를 담을 수 있다.
        rc.turnOn();
        rc.turnOff();

        rc = new Radio(); // 부품을 교체

        rc.turnOn();
        rc.turnOff();
        // 상수는 구현 갹체와 관련이 없는 인터페이스 멤버라서 인터페이스로 바로 접근이 가능하다.
        System.out.println("최대 볼륨 : " + remote_controller.MAX_VOLUME);
        System.out.println("최소 볼륨 : " + remote_controller.MIN_VOLUME);
        rc.setMute(true);
        rc.setMute(false);
        System.out.println("---------------");
        remote_controller.changeBatter();

//        remote_controller r1;
//        r1 = new Tv();
//        r1.turnOn();
//        r1.setVolume(-1);
//        r1.turnOff();
//
//        r1 = new Radio();
//        r1.turnOn();
//        r1.setVolume(40);
//        r1.turnOff();

    }
}
