package com.up.up_shop_test.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Created by andre on 12/5/2022
 */
@Configuration
public class Config {

    @Bean
    public ModelMapper getModel() {
        return new ModelMapper();
    }
}
