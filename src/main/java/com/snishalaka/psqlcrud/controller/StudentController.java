package com.snishalaka.psqlcrud.controller;

import com.snishalaka.psqlcrud.dto.StudentDTO;
import com.snishalaka.psqlcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public void save(@RequestBody StudentDTO studentDTO){
        studentService.saveStudentDetails(studentDTO);
    }

    @RequestMapping(value = "/all-details" , method = RequestMethod.GET)
    public List<StudentDTO> getALl() {
        return studentService.getALlStudents();
    }

    @RequestMapping(value = "/find/{sid}" , method = RequestMethod.GET)
    public StudentDTO getStudent(@PathVariable("sid") String sid) {
        return studentService.findStudentById(sid);
    }

    @RequestMapping(value = "dlt/{sid}" , method = RequestMethod.DELETE)
    public void deleteStdent(@PathVariable("sid") String sid) {
        studentService.removeStuednt(sid);
    }

}
