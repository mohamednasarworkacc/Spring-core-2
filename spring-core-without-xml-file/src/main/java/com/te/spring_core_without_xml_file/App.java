package com.te.spring_core_without_xml_file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
       Car b=(Car)ac.getBean(Car.class);
       b.drive();
       System.out.println(b.name);
    }
}
