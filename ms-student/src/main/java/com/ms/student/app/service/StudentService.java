package com.ms.student.app.service;

import com.ms.student.app.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    void update(Long id, Student student);
    void delete(Long id);

}
