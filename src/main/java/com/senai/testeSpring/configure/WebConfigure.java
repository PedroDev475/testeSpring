package com.senai.testeSpring.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigure implements WebMvcConfigurer{
    @Override
    public void addViewController(ViewControllerRegistry registry){
      registry.addViewController("/{spring:[a-zA-zo-9\\-_]+}").
    }
}

