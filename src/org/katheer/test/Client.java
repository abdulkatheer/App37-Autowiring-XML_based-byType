package org.katheer.test;

import org.katheer.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        autowire=byType
        ---------------
        In this method, the type of property is considered for finding bean object in XML.
        If two beans have same type in XML code, we'll get an exception.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("org/katheer/resource/applicationContext.xml");
        Student std1 = (Student) context.getBean("std1");
        std1.showStudentDetails();
    }
}
