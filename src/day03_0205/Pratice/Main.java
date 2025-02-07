package day03_0205.Pratice;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(8);
        Animal chicken = new Chicken(3);
        Chicken cheatableChicken = new Chicken(5);
//        Animal[] animal = new Animal[3];
//        Chicken[] c1 = new Chicken[3];
//        animal[0] = dog;
//        animal[1] = chicken;
//        c1[0] = cheatableChicken;
//        System.out.println(c1[0].fiy());



//        dog.run(1);
//        System.out.println(dog.getDistnace());
//        dog.run(2);
//        System.out.println(dog.getDistnace());
//        dog.run(3);
//        System.out.println(dog.getDistnace());
//        System.out.println();
//        chicken.run(1);
//        System.out.println(chicken.getDistnace()-chicken.speed);
//        chicken.run(2);
//        System.out.println(chicken.getDistnace()-chicken.speed*2);
//        chicken.run(3);
//        System.out.println(chicken.getDistnace()-chicken.speed*3);
//        System.out.println();
//        cheatableChicken.fiy();
//        cheatableChicken.run(1);
//        System.out.println(cheatableChicken.getDistnace()/2);
//        cheatableChicken.run(2);
//        System.out.println(cheatableChicken.getDistnace()/2);
//        cheatableChicken.run(3);
//        System.out.println(cheatableChicken.getDistnace()/2);








        System.out.println("1시간 후");
        dog.run(1);
        System.out.println("개의 이동거리= "+dog.getDistnace());
        chicken.run(1);
        System.out.printf("닭의 이동거리= %.1f\n" ,chicken.getDistnace()-chicken.speed);
        cheatableChicken.fiy();
        cheatableChicken.run(1);
        System.out.printf("날으는 닭의 이동거리= %.1f\n",cheatableChicken.getDistnace()/2);
        System.out.println("2시간후");

        dog.run(2);
        System.out.println("개의 이동거리= "+dog.getDistnace());
        chicken.run(2);
        System.out.printf("닭의 이동거리= %.1f\n" ,chicken.getDistnace()-chicken.speed*2);
        cheatableChicken.run(2);
        System.out.printf("날으는 닭의 이동거리= %.1f\n",cheatableChicken.getDistnace()/2);

        System.out.println("3시간 후");

        dog.run(3);
        System.out.println("개의 이동거리= "+dog.getDistnace());
        chicken.run(3);
        System.out.printf("닭의 이동거리= %.1f\n" ,chicken.getDistnace()-chicken.speed*3);
        cheatableChicken.run(3);
        System.out.printf("날으는 닭의 이동거리= %.1f\n",cheatableChicken.getDistnace()/2);






    }
}
