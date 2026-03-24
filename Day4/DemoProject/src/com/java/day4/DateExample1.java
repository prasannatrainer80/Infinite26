package com.java.day4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(d);
        System.out.println(str);
    }
}
