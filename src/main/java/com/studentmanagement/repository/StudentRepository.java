package com.studentmanagement.repository;

import com.studentmanagement.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    // By extending CrudRepository, you get built-in methods like save(), findById(), findAll(), deleteById()
}

