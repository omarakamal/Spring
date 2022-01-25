package com.example.studentms.controller;

import com.example.studentms.model.Bootcamp;
import com.example.studentms.model.Student;
import com.example.studentms.model.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class StudentControllerTest {
    @Mock
    StudentService studentService;
    @InjectMocks
    StudentController studentController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetStudents() {
        when(studentService.getStudents()).thenReturn(Arrays.<Student>asList(new Student(0, "name", "email", Arrays.<Bootcamp>asList(new Bootcamp(0, "location")))));

        List<Student> result = studentController.getStudents();
        Assertions.assertEquals(Arrays.<Student>asList(new Student(0, "name", "email", Arrays.<Bootcamp>asList(new Bootcamp(0, "location")))), result);
    }

    @Test
    void testRegisterNewStudent() {
        studentController.registerNewStudent(new Student(0, "name", "email", Arrays.<Bootcamp>asList(new Bootcamp(0, "location"))));
    }

    @Test
    void testDeleteStudent() {
        studentController.deleteStudent(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme