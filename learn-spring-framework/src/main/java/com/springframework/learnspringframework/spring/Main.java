package com.springframework.learnspringframework.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){


        var context = new AnnotationConfigApplicationContext(SpringConfigurationClass.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person2CallMethod"));
    }
}
