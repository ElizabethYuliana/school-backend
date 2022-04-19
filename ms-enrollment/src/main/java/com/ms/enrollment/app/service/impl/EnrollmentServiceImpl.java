package com.ms.enrollment.app.service.impl;

import com.ms.enrollment.app.entity.Class;
import com.ms.enrollment.app.entity.Enrollment;
import com.ms.enrollment.app.service.EnrollmentService;
import com.ms.enrollment.client.ClassClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    ClassClient classClient;

    @Override
    public Enrollment findByClass(Long idClass) {
        Class classObj = classClient.findById(idClass);
        return new Enrollment(01, classObj);
    }
}
