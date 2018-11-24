package com.snishalaka.psqlcrud.repository;

import com.snishalaka.psqlcrud.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}
