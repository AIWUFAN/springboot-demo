package com.test.jichu;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Arrays;
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
//        System.out.println("111\n22");
//        System.out.println("111\n22");
        bubbleeTest();
    }

    /**
     *  冒泡
     */
    public static void bubbleeTest(){
        int[] arr={2,1,5,0,3};
        for (int i=0;i<arr.length-1;i++) {
            for (int j=0;j<arr.length-i-1;j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }


        }
        Arrays.stream(arr).forEach(System.out::println);


    }

    /**
     * test1
     */

    public static void test1(){
        System.out.println("test1");
        System.out.println("test2");
    }


}
