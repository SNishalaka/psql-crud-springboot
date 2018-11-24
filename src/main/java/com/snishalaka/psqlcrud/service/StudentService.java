package com.snishalaka.psqlcrud.service;

import com.snishalaka.psqlcrud.dto.StudentDTO;
import com.snishalaka.psqlcrud.model.Student;
import com.snishalaka.psqlcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    //get all student details
    public List<StudentDTO> getALlStudents(){
        List<Student> studentsList = (List<Student>) studentRepository.findAll();
        return studentsList.stream().map(student -> new StudentDTO(
                student.getSid(),
                student.getName(),
                student.getAddress(),
                student.getAge()
        )).collect(Collectors.toList());
    }

    //find by sid
    public StudentDTO findStudentById(String sid){
        Student student = studentRepository.findById(sid).get();
        return new StudentDTO(
                student.getSid(),
                student.getName(),
                student.getAddress(),
                student.getAge()
        );
    }

    //remove student by sid
    public void removeStuednt(String sid){
        studentRepository.deleteById(sid);
    }
}
