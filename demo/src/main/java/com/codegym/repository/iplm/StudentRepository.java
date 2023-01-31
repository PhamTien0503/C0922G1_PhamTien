package com.codegym.repository.iplm;

import com.codegym.model.Student;
import com.codegym.repository.IStudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
    static List<Student>studentList=new ArrayList<>();
    static {
        studentList.add(new Student("Tien",12));
        studentList.add(new Student("Vu",2));
    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }
    @Override
    public void save(Student student) {
        studentList.add(student);

    }
}
