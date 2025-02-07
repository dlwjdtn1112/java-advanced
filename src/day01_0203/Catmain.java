package day01_0203;

public class Catmain {
    public static void main(String[] args) {
        Cat c1 = new Cat();

        Animal a1 = (Cat) c1;
        //cat과 animal은 타입만 다른 뿐  동일한 Cat객체를 가리킨다.
    }
}
