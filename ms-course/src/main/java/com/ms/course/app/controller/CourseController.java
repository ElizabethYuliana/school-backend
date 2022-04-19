package com.ms.course.app.controller;

import com.ms.course.app.entity.Course;
import com.ms.course.app.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/class")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping
    public void save(Course courseObj){
        courseService.save(courseObj);
    }

    @GetMapping
    public List<Course> findAll(){
        return courseService.listAll();
    }

    @GetMapping(path = "/{id}")
    public Course findById(@PathVariable(name = "id") Long id){
        return courseService.findById(id);
    }

}
