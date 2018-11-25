package com.houyi.config;

import com.houyi.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//这是一个配置类，要写配置注解 mvc的高级配置 实现这个接口
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    //要实现拦截器 就重写他的方法

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //把自定义的拦截器 对象放进去，然后 加上拦截路径
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}
