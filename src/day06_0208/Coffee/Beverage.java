package day06_0208.Coffee;

public abstract class Beverage {
    private String name;
    protected int price;

    public Beverage(String name){
        this.name = name;
        calPrice();
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public abstract void calPrice();

    public void print(int index){
        System.out.println(index + "번째 판매 음료는 "+ name + "이며, 가격은 " + price);
    }

}
