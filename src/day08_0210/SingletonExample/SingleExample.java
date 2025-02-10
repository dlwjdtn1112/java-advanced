package day08_0210.SingletonExample;

public class SingleExample {
    public static SingleExample instance;

    private SingleExample(){}

    public static SingleExample getInstance(){
        if(instance == null){
            instance = new SingleExample();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("싱글톤 인스턴스 호출됨!");
    }

}
