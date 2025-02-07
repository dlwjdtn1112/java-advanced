package Animal01;

public class Dog implements Animal{
    private String name;

    Dog(String name){
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "bark";
    }

    @Override
    public String getName() {
        return name;
    }
}
