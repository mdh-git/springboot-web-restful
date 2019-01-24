package com.mdh.config;

import com.mdh.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * Spring 5.0 之后取消了 WebMvcConfigurerAdapter
 * 使用WebMvcConfigurer
 * @Author: madonghao
 * @Date: 2019/1/18 14:31
 */
//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
//@EnableWebMvc   不要接管SpringMVC
@Configuration
public class MyMvcConfig implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        // super.addViewControllers(registry);
        //浏览器发送 /mdh 请求来到 success
        registry.addViewController("/mdh").setViewName("success");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //super.addInterceptors(registry);
        //静态资源；  *.css , *.js
        //addPathPatterns("/**")
        //SpringBoot已经做好了静态资源映射
        //registry.addInterceptor(new LoginHandlerInterceptor())
                //.excludePathPatterns("/index.html","/","/user/login");
    }

    @Bean
    public LocaleResolver localeResolver(){

        return new MyLocaleResolver();
    }
}
