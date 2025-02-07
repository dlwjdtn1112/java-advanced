package day02_0204;

public class Exce {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        printLength("This is java");
        printLength(null);
        //System.out.println("프로그램 종료");

        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

    }
    public static void printLength(String data){
        int result = 0;
        try {
            result = data.length();
        } catch (Exception e) {
            System.out.println(e.getMessage());
           // System.out.println(e.toString());
            //e.printStackTrace();
        }
        finally {
            System.out.println("마무리 실행");
        }
        System.out.println("문서의 수 : " + result);

    }
}
