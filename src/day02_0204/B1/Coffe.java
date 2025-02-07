package day02_0204.B1;

public class Coffe extends Beverge {
    public static int amount;

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        Coffe.amount = amount;
    }

    public Coffe(String name) {
        super(name);
        amount++;
    }

    @Override
    public void calcPrice() {
        switch (getName()) {
            case "Americano":
                setPrice(1500);
                break;
            case "CafeLatte":
                setPrice(2500);
                break;
            case "Cappuccino":
                setPrice(3000);
                break;
            default:
                setPrice(0);
                int mount;


        }
    }
}