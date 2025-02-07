package day03_0205.Interface;

public class Tv implements remote_controller{
    private int volume;
    public Tv(){}
    public Tv(int volume){
        this.volume = volume;

    }
    //public void set
    @Override
    public void turnOn() {
        System.out.println("Tv 전원을 켭니다.");
    }

    @Override
    public void turnOff() { //인터페이스에서 선언한 전원 on/off구현
        System.out.println("Tv 전원을 끕니다. ");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > remote_controller.MAX_VOLUME){
            this.volume = remote_controller.MAX_VOLUME;
            System.out.println("현재 해당 제품의 볼륨 최댓값 ");

        }
        else if(volume < remote_controller.MIN_VOLUME){
            this.volume  = remote_controller.MIN_VOLUME;
            System.out.println("mute");
        }
        else{
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨은 " + this.volume);

    }



}
