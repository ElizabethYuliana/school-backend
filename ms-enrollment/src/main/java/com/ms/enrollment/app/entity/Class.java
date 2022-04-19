package com.ms.enrollment.app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@AllArgsConstructor
@Getter
@Setter
public class Class {

    private Long id;

    private String title;

    private String description;

    private String status;

    private LocalDate createAt;

}
