package dependencyinjectionexample;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("student/beanstudent.xml");
        StudentService studentService =(StudentService) applicationContext.getBean("studentService",StudentService.class);
        List<Student> students = studentService.findAll();
        for (Student student: students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Address: " + student.getAddress());
        }

        //Thêm sinh viên
        Student studentAdd = new Student(3L,"Long",28,"Đà Nẵng");
        studentService.addStudent(studentAdd);

        //update sinh viên
        Student studentUp = studentService.findById(2L);
        studentUp.setName("Võ Thị TToan");
        studentService.updateStudent(studentUp);

        //xóa sinh viên
        studentService.deleteStudent(1L);

//hiển thị lại danh sách
        System.out.println("================================");
        for (Student student: students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Address: " + student.getAddress());
        }
    }
}
