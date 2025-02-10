package day06_0208.Coffee;

public class Coffee extends Beverage{
    public static int amount;

    public static int getAmount(){
        return Coffee.amount;
    }
    Coffee(String name){
        super(name);
        amount++;
    }

    public void calPrice(){
        if(getName() == "Americano"){
            setPrice(1500);
        }
        else if(getName() == "CafeLatte"){
            setPrice(2500);
        }
        else if(getName() == "Cappuccino"){
            setPrice(3000);
        }
        else{
            setPrice(0);
        }
    }
}
