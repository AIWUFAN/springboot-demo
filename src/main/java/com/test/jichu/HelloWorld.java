package com.test.jichu;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
    private  static Logger logger =  Logger.getLogger(HelloWorld.class.getName());

    public static void sayHello(String message){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY.MM.dd");
        String today = simpleDateFormat.format(new Date());
        logger.info(today+": " +message);
    }

    public static void main(String[] args) {

        //sayHello("哈哈");
        System.out.println("111\n22");
        System.out.println("111\n22");
    }

}
