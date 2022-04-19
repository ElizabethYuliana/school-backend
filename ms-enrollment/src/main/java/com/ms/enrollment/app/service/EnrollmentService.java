package com.ms.enrollment.app.service;


import com.ms.enrollment.app.entity.Enrollment;

public interface EnrollmentService {

    Enrollment findByClass(Long idClass);
}
