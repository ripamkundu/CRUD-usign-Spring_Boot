package com.pay.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pay.app.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    
    List<Student> findByName(String name);
    
}