package com.example.basic.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    Film film(@Autowired @Qualifier("ani") Actor actor) {
        return new Film(actor);
    }

    @Bean(value = "ani")
    public MaheshBabu maheshBabu() {
        return new MaheshBabu();
    }

    @Bean
    @Primary
    public KK kk() {
        return new KK();
    }

    @Bean
    public SRK srk() {
        return new SRK();
    }
}
