package com.test.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BrithdayAge {
    public static void main(String[] args) throws ParseException{
        getAge(parse("1994-12-28"));
        System.out.println("3");
        System.out.println("4");
        
    }

    //由出生日期获得年龄
    public static Date parse(String str) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.parse(str);
    }

    public static int getAge(Date birthday){
        Calendar calendar = Calendar.getInstance();

        if (calendar.before(birthday)) {
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }

        //获取现在的年月日
        int yearNow = calendar.get(Calendar.YEAR);
        int monthNow = calendar.get(Calendar.MONTH) + 1;
        int dayNow = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.setTime(birthday);

        //设置时间
        int yearBirth = calendar.get(Calendar.YEAR);
        int monthBirth = calendar.get(Calendar.MONTH) + 1;
        int dayOfMonthBirth = calendar.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayNow < dayOfMonthBirth) {
                    age--;
                }
            } else {
                age --;
            }

        }

        return age;
    }

}
