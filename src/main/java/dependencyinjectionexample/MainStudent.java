package dependencyinjectionexample;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("student/beanstudent.xml");
        StudentService studentService =(StudentService) applicationContext.getBean("studentService",StudentService.class);
        System.out.println("hiển thị danh sách"+studentService.findAll());
    }
}
