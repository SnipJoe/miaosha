package com.miaoshaproject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableAutoConfiguration
@RestController

public class App {

    @RequestMapping("/")
    public String home(){
        return "hello World!";
    }
    public static void main( String[] args) {

        System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);
    }

}
