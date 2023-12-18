package dependencyinjectionexample;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();

    Student findById(long id);

    void save(Student student);

    void update(Student student);

    void deleteById(long id);
}
