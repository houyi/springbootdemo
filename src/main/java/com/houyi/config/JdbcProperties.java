package com.houyi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

//配置属性注解 提供get和set方法 data 自动生成get set tostring hashcode方法
//加前缀 prefix = "jdbc" 使用多个方式注入
//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {

    String url;
    String driverClassName;
    String username;
    String password;
}
