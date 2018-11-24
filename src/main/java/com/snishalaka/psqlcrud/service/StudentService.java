package com.snishalaka.psqlcrud.service;

import com.snishalaka.psqlcrud.dto.StudentDTO;
import com.snishalaka.psqlcrud.model.Student;
import com.snishalaka.psqlcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    //save student
    public void saveStudentDetails(StudentDTO studentDTO){

        studentRepository.save(new Student(
                studentDTO.getSid(),
                studentDTO.getName(),
                studentDTO.getAddress(),
                studentDTO.getAge()
        ));
    }
}
