package com.ms.student.app.service.impl;

import com.ms.student.app.entity.Student;
import com.ms.student.app.repository.StudentRepository;
import com.ms.student.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Student student) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        student.setStatus("CREATED");
        student.setCreateAt(LocalDateTime.now().format(dateTimeFormatter));
        Integer result = studentRepository.save(student);
        if (result != 1){
            throw new IllegalStateException("No se puede guardar un nuevo estudiante");
        }
    }

    @Override
    public void update(Long id, Student student) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        student.setId(id);
        student.setStatus("UPDATED");
        student.setCreateAt(LocalDateTime.now().format(dateTimeFormatter));
        studentRepository.update(student);
    }

    @Override
    public void delete(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            student.setStatus("DELETED");
            studentRepository.update(student);
        }
    }
}
