package com.houyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

//自动扫描包  自动扫描mapper接口文件 通用mapper里面的
@SpringBootApplication
@MapperScan("com.houyi.mapper")
public class BootDemoA {
    public static void main(String[] args) {
        //启动spring
        SpringApplication.run(BootDemoA.class, args);
    }
}
