package day02_0204.userde;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        account.depos(10000000);

        System.out.println("현재 잔고 : " + account.getBalance());

        //출금
        try {
            account.withdraw(30000000);
        } catch (Insuf e) {
            //throw new RuntimeException(e);
            String message = e.getMessage();
            System.out.println(message);
        }

    }
}
