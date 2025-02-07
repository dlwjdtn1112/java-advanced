package day03_0205;

public class Tea extends Beverge {
    public static int amount;

    public static int getAmount(){
        return amount;
    }

    public static void setAmount(int amount){
        Tea.amount = amount;
    }

    public Tea(String name){
        super(name);
        amount ++;
    }

    @Override
    public void calcPrice() {
        if(getName() == "lemonTea"){
            setPrice(1500);
            //return 1500;
        }
        else if(getName() == "ginsengTea"){
            setPrice(2000);
            //return 2000;
        }
        else if(getName() == "redginsengTea"){
            setPrice(2500);
            //return 2500;
        }
        else{
            setPrice(0);
            //return 0;
        }

    }
}
