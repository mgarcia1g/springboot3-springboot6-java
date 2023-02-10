package com.springframework.learnspringframework.spring;

import java.io.Serializable;

// Class is simply to compare different types of beans
public class SpringBeanVSPojoVSJavaBean {

}
//no constraints to pojo
class Pojo{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

//JavaBeans have to implement serializable interface
class JavaBean implements Serializable {
    private String firstName;
    private int birthYear;

    // has to have no args constructor...which is given by default... example below is just for visual
    public JavaBean(){

    }
    // has to have getter and settter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

}

class SpringBean{
    // ANY JAVA CLASS managed by spring
}

