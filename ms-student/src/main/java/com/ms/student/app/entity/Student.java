package com.ms.student.app.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Student {

    private Long id;
    private String fatherSurname;
    private String motherSurname;
    private String names;
    private String status;
    private String createAt;

}
