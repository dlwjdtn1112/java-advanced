package day04_0206.Sound;

public class SoundEx {
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());


    }
    public static void  printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }
}
