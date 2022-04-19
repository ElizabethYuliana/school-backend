package com.ms.course.app.service.impl;

import com.ms.course.app.entity.Course;
import com.ms.course.app.repository.CourseRepository;
import com.ms.course.app.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public Course save(Course courseObj) {
        return courseRepository.save(courseObj);
    }

    @Override
    public Course update(Long idClass, Course courseObj) {
        return null;
    }

    @Override
    public Course delete(Long idClass) {
        Course courseObj = findById(idClass);
        courseObj.setStatus("DELETED");
        return courseRepository.save(courseObj);
    }

    @Override
    public List<Course> listAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course findById(Long idClass) {
        return courseRepository.findById(idClass).orElse(null);
    }
}
