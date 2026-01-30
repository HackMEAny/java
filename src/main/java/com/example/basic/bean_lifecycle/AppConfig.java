package com.example.basic.bean_lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public static CustomBeanFactoryPostProcesser customBeanFactoryPostProcesser() {
        return new CustomBeanFactoryPostProcesser();
    }

    @Bean
    public static CustomBeanPostProcesser customBeanPostProcesser() {
        return new CustomBeanPostProcesser();
    }

    @Bean
    public Laptop laptop() {
        return new Laptop();
    }
}
