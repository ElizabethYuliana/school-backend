package com.ms.student.app.repository;

import com.ms.student.app.entity.Student;

import java.util.List;
import java.util.Optional;


public interface StudentRepository  {

    List<Student> findAll();
    Optional<Student> findById(Long id);
    Integer save(Student student);
    Integer delete(Long id);
    Integer update(Student student);

}
