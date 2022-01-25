package com.example.studentms.controller;

import com.example.studentms.model.Student;
import com.example.studentms.model.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "api/student")
public class StudentController<studentService> {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }



    @PostMapping(path = "add")
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }


    @DeleteMapping(path = "delete/{studentId}")
    public void deleteStudent(@PathVariable ("studentId") Integer studentId){
        studentService.deleteStudent(studentId);
    }

}