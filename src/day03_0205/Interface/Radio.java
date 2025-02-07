package day03_0205.Interface;

public class Radio implements remote_controller{
    private int volume;

    public Radio(){}
    public Radio(int volume){
        this.volume = volume;
    }


    @Override
    public void turnOn() {
        System.out.println("라디오를 킨다");

    }

    @Override
    public void turnOff() {
        System.out.println("라디오를 끈다.");

    }

    @Override
    public void setVolume(int volume) {
        if(volume > remote_controller.MAX_VOLUME){
            this.volume = MAX_VOLUME;
            System.out.println("현재 최대 볼륨"  );
        }
        else if(volume < remote_controller.MIN_VOLUME){
            this.volume = MIN_VOLUME;
            System.out.println("mute");
        }
        else{
            this.volume = volume;
            System.out.println("현재 라디오 볼륨은 "+this.volume);
        }

    }
}
