/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.jdbc;

import java.util.List;

public interface StudentDAO {

    public void create(String name, Integer age);

    public List<Student> listStudents();

    public void delete(Integer id);
}
