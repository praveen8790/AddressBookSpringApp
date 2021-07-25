//package com.example.addressbookspring.security;
//
//import com.example.employeepayrollspring.controller.CorsFilter;
//import com.example.employeepayrollspring.controller.EmployeePayrollController;
//import net.bytebuddy.matcher.ElementMatcher;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.CorsUtils;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
//
//import java.util.Arrays;
//
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .requestMatchers(CorsUtils::isPreFlightRequest,CorsUtils::isCorsRequest).permitAll()
//                .anyRequest().authenticated()
//                .and().httpBasic();
//    }
//
//}