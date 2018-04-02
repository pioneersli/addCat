package com.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主程序
 *
 * @author lihexiao
 * @create 2018-04-02 21:39:01
 **/
@SpringBootApplication
@ComponentScan(basePackages = {"com.cat"})
public class AdminApplication {
    public static void main(String[] args){
        SpringApplication.run(AdminApplication.class,args);
    }
}
