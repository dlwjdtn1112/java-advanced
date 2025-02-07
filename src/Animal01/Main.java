package Animal01;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");

        printAnimalSound(dog);

    }
    public static void printAnimalSound(Animal animal){
        System.out.println(animal.getName() + " say " + animal.makeSound());
    }
}
