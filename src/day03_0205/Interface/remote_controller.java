package day03_0205.Interface;

public interface remote_controller {
    // 가장큰 볼륨을 저장할 멤버 30
    public static final int MAX_VOLUME = 30;
    public static final int MIN_VOLUME = 0;

    public abstract void turnOn();

    public abstract void turnOff(); // 바디 {}

    public abstract void setVolume(int volume); //볼륨셋팅

    //public abstract int getVolume();

    default void setMute(boolean mute){
        if(mute){
            System.out.println("쉿 모드로 전환합니다.");
            setVolume(MIN_VOLUME);
        } else{
            System.out.println("쉿 모드가 해제");
        }
    }

    //배터리 교체가 기능을 정적메소드를 통하여 구현 changeBattery

    public static void changeBatter(){
        System.out.println("건전지를 교체합니다.");
    }




}


