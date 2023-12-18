package dependencyinjectionexample;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private List<Student> students;
    @PostConstruct
    public List<Student> findAll(){
        students = new ArrayList<>();
        Student student1 = new Student();
        student1.setId(1L);
        student1.setName("Thuan");
        student1.setAge(22);
        student1.setAddress("Quang Binh");

        Student student2 = new Student();
        student2.setId(2L);
        student2.setName("Nam");
        student2.setAge(23);
        student2.setAddress("Ha Noi");
     students.add(student1);
     students.add(student2);
     return students;
    }
    @Override
    public Student findById(long id) {
        for (Student student: students) {
            if(student.getId()==id){
                return  student;
            }
        }
        return null;
    }

    @Override
    public void save(Student student) {
      students.add(student);
    }

    @Override
    public void update(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                return;
            }
        }
    }

    @Override
    public void deleteById(long id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return;
            }
        }
    }
}
