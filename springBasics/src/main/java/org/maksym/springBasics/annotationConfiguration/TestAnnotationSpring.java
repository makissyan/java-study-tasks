package org.maksym.springBasics.annotationConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");

        Software software = applicationContext.getBean("software", Software.class);
        System.out.println(software);

        applicationContext.close();
    }
}
