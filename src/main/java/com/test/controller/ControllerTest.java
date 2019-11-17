package com.test.controller;

import com.test.jichu.HelloService;
import com.test.jichu.HelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class ControllerTest {

    private static final Logger logger= LoggerFactory.getLogger(ControllerTest.class);

   // @Resource
  //  HelloService helloService;


    public static void main(String[] args) {
        HelloService helloService = new HelloService();

        String s = helloService.sayHello();
        logger.info("controller test method index :{} ", s );
    }



}
