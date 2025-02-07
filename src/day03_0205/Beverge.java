package day03_0205;

public abstract class Beverge {
    private String name;
    protected int price;

    public Beverge(String name){
        this.name = name;
        calcPrice();
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int prince){
        this.price = price;
    }

    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }

    public abstract void calcPrice();
    public void print(int index){
        System.out.println(index + "번째 판매 음료는 "+ name + "이며, 가격은" + price);

    }
}
