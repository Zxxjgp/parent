package chart1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName DateTest
 * @date 2020/1/16  23:05
 */
public class DateTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime todayHours = LocalTime.now();
        LocalDateTime k = LocalDateTime.now();
        System.out.println(k.getHour());
        System.out.println(k.getMonth());
        System.out.println(k);
        System.out.println("今天是：" + today);
        System.out.println("今天是现在的时间是：" + todayHours);

        LocalDate of = LocalDate.of(2020, 01, 15);

        boolean equals = of.equals(today);
        System.out.println(equals);


        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2018,2,6);
        MonthDay birthday = MonthDay.of(date2.getMonth(),date2.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(date1);


        if(currentMonthDay.equals(birthday)){
            System.out.println("是你的生日");
        }else{
            System.out.println("你的生日还没有到");
        }

    }
}
