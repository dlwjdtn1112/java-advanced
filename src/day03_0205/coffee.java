package day03_0205;

public class coffee extends Beverge {
    public static int amount;

    public static int getAmount(){
        return amount;
    }

    public static void setAmount(int amount){
        coffee.amount = amount;
    }

    public coffee(String name){
        super(name);
        amount ++;
    }

    @Override
    public void calcPrice() {
        if(getName() == "Americano"){
            setPrice(1500);
            //return 1500;

        }
        else if(getName() == "CafeLatte"){
            setPrice(2500);
            //return 2500;
        }
        else if(getName() == "Cappuccino"){
            setPrice(3000);
            //return 3000;
        }
        else{
            setPrice(0);
            //return 0;
        }

    }
}
