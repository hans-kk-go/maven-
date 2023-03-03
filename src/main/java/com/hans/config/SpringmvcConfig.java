package com.hans.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.hans.controller","com.hans.config"})
@EnableWebMvc
public class SpringmvcConfig {
}
