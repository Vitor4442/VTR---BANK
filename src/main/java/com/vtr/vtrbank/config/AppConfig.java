package com.vtr.vtrbank.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

   @Bean
    public ModelMapper modelMapperCofig(){
       ModelMapper modelMapper = new ModelMapper();
       modelMapper.getConfiguration()
               .setFieldMatchingEnabled(true)
               .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
               .setMatchingStrategy(MatchingStrategies.STANDARD);

       return modelMapper;
   }
}
