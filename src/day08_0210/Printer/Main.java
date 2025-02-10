package day08_0210.Printer;

public class Main {
    public static void main(String[] args) {
        Printer p1 = Printer.getInstance();
        Printer p2 = Printer.getInstance();

        if(p1 == p2){
            System.out.println("같다");
        }
        p1.print("a4");
        p2.print("a1");
        //.print("a1");


    }
}
