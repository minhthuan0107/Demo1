package dependencyinjectionexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void updateStudent(Student student) {
       studentRepository.update(student);
    }

    @Override
    public void deleteStudent(long id) {
      studentRepository.deleteById(id);
    }

    @Override
    public Student findById(long id) {
        return studentRepository.findById(id);
    }
}
