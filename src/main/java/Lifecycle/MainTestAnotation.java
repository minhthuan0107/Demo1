package Lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestAnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Lifecycle/beanannotation.xml");
        BeansLifeCycleAnnotation beansLifeCycleAnnotation =(BeansLifeCycleAnnotation) applicationContext.getBean("beansLifeCycleAnnotation",BeansLifeCycleAnnotation.class);
    }



}
