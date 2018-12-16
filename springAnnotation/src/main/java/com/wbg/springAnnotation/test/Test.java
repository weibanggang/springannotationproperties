package com.wbg.springAnnotation.test;

import com.wbg.springAnnotation.annotation.config.ApplicationConfig;
import com.wbg.springAnnotation.annotation.config.DataSourceBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("database-config.xml");

    }
}
