package day02_0204.pra;

public class ThrowEx {
    public static void main(String[] args) throws Exception{//JVM이 최종적으로 처리한다.
        try {
            findClass();
        } catch (Throwable e) {
            //throw new RuntimeException(e);
            System.out.println("예외처리 " + e.getMessage());
        }
        findClass();

    }


    public static void findClass() throws Exception{
        Class.forName("java.lang.String2");
    }
}
