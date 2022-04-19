package com.ms.student.app.controller;


import com.ms.student.app.entity.Student;
import com.ms.student.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> listAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable("id") Integer id){
        return studentService.findById(id.longValue());
    }

    @PostMapping
    public void save(@RequestBody Student student){
        studentService.save(student);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Integer id, @RequestBody Student student){
        studentService.update(id.longValue(), student);
    }

    public void delete(@PathVariable("id") Integer id){
        studentService.delete(id.longValue());
    }


    public void listar(){

    }
}
