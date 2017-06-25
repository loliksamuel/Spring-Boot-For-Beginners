//package com.in28minutes.springboot.security;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * Created by lolik on 2017-06-06.
// */
//@Configuration
//public class SpringSecurityWebAppConfig extends WebSecurityConfigurerAdapter {
//   @Override
//protected void configure(HttpSecurity http) throws Exception {
//        http
//        .authorizeRequests()
//        .antMatchers("/hello/**").permitAll()
//        .anyRequest().authenticated()
//        .and()
//        .formLogin()
//        .loginPage("/login")
//        .permitAll()
//        .and()
//        .logout()
//        .permitAll();
//        }
//
//}
