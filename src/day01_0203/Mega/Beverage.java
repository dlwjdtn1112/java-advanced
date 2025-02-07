package day01_0203.Mega;

public abstract class Beverage {
    private String name;
    private int price;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    //Beverage(){}
    Beverage(String name){
        this.name = name;

    }

    public abstract void calPrice();

    public void print(){}
}
