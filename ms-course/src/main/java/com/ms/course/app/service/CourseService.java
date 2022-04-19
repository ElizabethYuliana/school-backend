package com.ms.course.app.service;

import com.ms.course.app.entity.Course;

import java.util.List;


public interface CourseService {

    Course save(Course courseObj);
    Course update(Long idClass, Course courseObj);
    Course delete(Long idClass);
    List<Course> listAll();
    Course findById(Long idClass);
}
