package day06_0208.Coffee;

public class Tea extends Beverage{
    static int amount;

    Tea(String name){
        super(name);
        amount++;
    }


    public int getAmount(){
        return Tea.amount;
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
