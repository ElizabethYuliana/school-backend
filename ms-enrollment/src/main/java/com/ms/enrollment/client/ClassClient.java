package com.ms.enrollment.client;

import com.ms.enrollment.app.entity.Class;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "ms-class")
public interface ClassClient {

    @GetMapping("/ms-class/class")
    List<Class> listAll();

    @GetMapping("/ms-class/class/{id}")
    Class findById(@PathVariable(name = "id") Long idClass);
}
