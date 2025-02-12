package day08_0210.API;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar now  = Calendar.getInstance();


        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+ 1;







        String[] availableIDs = TimeZone.getAvailableIDs();
        for(String id : availableIDs) System.out.println(id);




    }
}