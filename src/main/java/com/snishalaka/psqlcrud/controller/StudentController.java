package com.snishalaka.psqlcrud.controller;

import com.snishalaka.psqlcrud.dto.StudentDTO;
import com.snishalaka.psqlcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public void save(@RequestBody StudentDTO studentDTO){
        studentService.saveStudentDetails(studentDTO);
    }
}
