package com.ms.student.app.repository.impl;

import com.ms.student.app.entity.Student;
import com.ms.student.app.repository.StudentRepository;
import com.ms.student.app.repository.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    String sql;

    @Override
    public List<Student> findAll() {
        sql = "SELECT * FROM student ORDER BY id ASC";
        return jdbcTemplate.query(sql, new StudentMapper());
    }

    @Override
    public Optional<Student> findById(Long id) {
        sql = "SELECT * FROM student WHERE id = ?";
        return jdbcTemplate.query(sql, new StudentMapper(), id).stream().findFirst();
    }

    @Override
    public Integer save(Student student) {
        sql =
                "INSERT INTO student(father_surname, mother_surname, names, status, create_at) " +
                "VALUES (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, student.getFatherSurname(), student.getMotherSurname(),
                                        student.getNames(), student.getStatus(), student.getCreateAt());
    }

    @Override
    public Integer delete(Long id) {
        sql = "DELETE FROM student WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public Integer update(Student student) {
        sql = "UPDATE student SET father_surname = ?, " +
                                "mother_surname = ?," +
                                "names = ?," +
                                "status = ?," +
                                "create_at = ?" +
                "WHERE id = ?";
        return jdbcTemplate.update(sql, student.getFatherSurname(), student.getMotherSurname(), student.getNames(),
                                        student.getStatus(), student.getCreateAt(), student.getId());
    }
}
