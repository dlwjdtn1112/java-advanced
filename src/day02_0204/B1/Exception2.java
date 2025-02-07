package day02_0204.B1;

public class Exception2 {
    public static void main(String[] args) {
        String[] stringarray = {"100","l00","nuldfsfl"};
        for(int i = 0; i < stringarray.length;i++){
            try {
                int value = Integer.parseInt(stringarray[i]);
                System.out.println(value);
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println("배열 인덱스가 초과" + e1.getMessage());
            }catch (NumberFormatException e1){
                System.out.println("숫자로 변환할 수 없는 데이터입니다."+ e1.getMessage());
            }catch (Exception e1){
                System.out.println("실행에 오류 발생" + e1.getMessage());
            }
        }
    }
}
