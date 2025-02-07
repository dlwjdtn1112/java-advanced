package day01_0203.REMOTE;

public class TVMain {
    public static void main(String[] args) {
        TV tvremote1 = new TV();
        TV tvremote2 = new SmartTV();
        SmartTV smartremote = new SmartTV();

        TV tv = new TV();
        SmartTV smart_control = (SmartTV) tv;



    }
}
