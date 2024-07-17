package com.f1soft.Task.DateandTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeFunctions {
    public static void main(String[] args){
        //shows the  date and time in yyyy-MM-dd-HH-mm-ss.zzz.from the system
        LocalDateTime today = LocalDateTime.now();//now() take the current date and time from the system from the default time zone
        System.out.println("Today date before formatting:" + today);

        //formats the date and time as we require
        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDate= today.format(format);
        System.out.println("Today date after formatting:" + formatedDate);

        //Zone Functions
        //ZoneID class
        ZoneId zoneId=ZoneId.of("Asia/Kathmandu");
        System.out.println("ZoneId class result "+zoneId.getId());

        //ZoneDateTime
        ZonedDateTime zonedDateTime=ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");//T is a standard separator according to ISO 8601 for date and time separation
        System.out.println("ZonedDateTime result" + zonedDateTime);
        System.out.println("getZone() result" + zonedDateTime.getZone());


        //DayOfWeek:provides the day of the provided dateFormat.
        LocalDate localDate = LocalDate.of(2024, Month.MAY, 15);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));//ChronoField-field-based access to manipulate a date, time or date-time.





    }
}
