package day01_0203.Mega;

public  class Coffee extends Beverage{
    static int amount;
    //Coffee(){}
    Coffee(String name){
        super(name);
        //this.amount = amount;
        //this.price = price;
        //getAmount();
    }

    static public int getAmount(){
        amount += 1;
        return  amount;
    }

    public void calPrice(){
        System.out.println("Animal01");
    }

}
