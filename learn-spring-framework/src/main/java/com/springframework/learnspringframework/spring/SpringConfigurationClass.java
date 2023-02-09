package com.springframework.learnspringframework.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//Configure spring application with annotation
record  Person(String name, int age, Address address){};
record Address(String street, String city){};
@Configuration
public class SpringConfigurationClass {
    @Bean
    public Person person(){
        return new Person("Marco",28, new Address("1223 intellij Dr","Cbus"));
    }
    @Bean
    public int age(){
        return 28;
    }

    @Bean
    public Address address(){
        return new Address("1234 Intellij cir", "Columbus");
    }

    //create bean
    @Bean
    public String name(){
        return "Marco Garcia";
    }

    @Bean
    public Person person2CallMethod(){
        return new Person(name(),age(),address());
    }
}
