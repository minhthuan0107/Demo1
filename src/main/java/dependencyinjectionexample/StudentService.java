package dependencyinjectionexample;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(long id);
    Student findById(long id);


}
