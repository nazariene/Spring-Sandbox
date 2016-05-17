/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private DataSource ds;

    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(ds);
    }

    @Override
    public void create(String name, Integer age) {
        String SQL = "insert into Student (name, age) values (?, ?)";

        getJdbcTemplate().update( SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
    }

    @Override
    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List <Student> students = getJdbcTemplate().query(SQL, new StudentMapper());
        return students;
    }

    @Override
    public void delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        getJdbcTemplate().update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
    }
}
