package com.itheima_01;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");


    }
}
