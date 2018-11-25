package com.houyi.config;

//配置数据
//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

    // 配置的方式把对象new出来
    //凡是子类及带属性、方法的类都注册Bean到Spring中，交给它管理 使用多个注入
    //@Bean 用在方法上，告诉Spring容器，你可以从下面这个方法中拿到一个Bean
/*    @Bean
    public DataSource dataSource(JdbcProperties jp) {
        DruidDataSource druidDataSource = new DruidDataSource();
        //注入属性参数
        druidDataSource.setDriverClassName(jp.getDriverClassName());
        druidDataSource.setUrl(jp.getUrl());
        druidDataSource.setUsername(jp.getUsername());
        druidDataSource.setPassword(jp.getPassword());
        return druidDataSource;
    }*/

    //    第二种简单的属性注入 适合 一个方法用
   /* @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        return new DruidDataSource();
    }*/
}
