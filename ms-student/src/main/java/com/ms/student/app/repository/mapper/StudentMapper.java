package com.ms.student.app.repository.mapper;

import com.ms.student.app.entity.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper  implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Student(rs.getLong("id"),
                rs.getString("father_surname"),
                rs.getString("mother_surname"),
                rs.getString("names"),
                rs.getString("status"),
                rs.getString("create_at"));
    }
}
