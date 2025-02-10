package day08_0210.Printer;

public class Printer {
    private static Printer printerInstance;

    private Printer(){
        System.out.println("프린터 초기화");
    }

    public static  Printer getInstance(){
        if(printerInstance == null){
            printerInstance = new Printer();
        }
        return printerInstance;
    }

    public void print(String document){
        System.out.println("문서 출력 중 " + document);
    }
}
