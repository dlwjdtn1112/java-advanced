package day08_0210.API;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//LocalDateTime 클래스는 시간을 조작 할 수 있는 기능 제공
public class DateTimeOperator {
    public static void main(String[] args) {

        //1. 현재 시간 받아오기
        LocalDateTime now  = LocalDateTime.now();
        System.out.println(now.toString());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println("현재시간 : "+now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1 년후 현재시간 : " + result1.format(dtf));

        LocalDateTime result2 = now.plusHours(1);
        System.out.println("1시간 후 현재 시간 : "+result2.format(dtf));

        LocalDateTime result3 = now.plusDays(2);
        System.out.println(result3.format(dtf));

        //LocalDateTime target =  LocalDateTime.of(year,dayofMonth,hour,minute,second);
        




    }
}
