package Lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Lifecycle/bean.xml");
        BeanLifeCycle beansLifeCycle = (BeanLifeCycle) applicationContext.getBean("beanLfieCycle", BeanLifeCycle.class);
    }
}