package com.itheima_02;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

//       三年前的今天
//        c.add(Calendar.YEAR,-3);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

//        十年后的五天前
//        c.add(Calendar.YEAR,+10);
//        c.add(Calendar.DATE,-5);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        c.set(2050,11,12);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

    }
}
