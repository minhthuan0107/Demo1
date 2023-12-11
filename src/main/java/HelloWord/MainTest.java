package HelloWord;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        helloWord hellwoord = (helloWord) context.getBean("helloBean");
        hellwoord.printHello();

    }
}
