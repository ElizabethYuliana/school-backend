package com.ms.enrollment.app.controller;


import com.ms.enrollment.app.entity.Enrollment;
import com.ms.enrollment.app.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {

    @Autowired
    EnrollmentService enrollmentService;

    @GetMapping("/{id}")
    public Enrollment findByClass(@PathVariable(name = "id") Long idClass){
        return enrollmentService.findByClass(idClass);
    }
}
