package day02_0204.userde;

public class Account {
    private long balance;
    //계좌 잔고 저장 멤버
    public Account(){}
    public Account(long balance){
        this.balance = balance;
    }
    public long getBalance(){
        return balance;
    }
    public void setBalance(long balance){
        this.balance=  balance;
    }
    public void depos(int money){
        this.balance += money;
    }

    public void withdraw(int money) throws Insuf{//호출한 곳으로 예외 떠넘김.

        if(this.balance < money){
            throw new Insuf("잔고 부족으로 출금이 안된다." + (money-this.balance) + "부족합니다.");
        }
        this.balance -= money;

    }
}
