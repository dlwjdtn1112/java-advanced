package Ex02;

import Ex02.Tire;

public class HankookTire implements Tire {
    @Override
    public void roll(){
        System.out.println("한국 타이어 회전합니다.");
    }
}
