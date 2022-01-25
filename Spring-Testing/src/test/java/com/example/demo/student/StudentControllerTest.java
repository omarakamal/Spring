package com.example.demo.student;

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
    void testGetAllStudents() {
        when(studentService.getAllStudents()).thenReturn(Arrays.<Student>asList(new Student(Long.valueOf(1), "name", "email", Gender.MALE)));

        List<Student> result = studentController.getAllStudents();
        Assertions.assertEquals(Arrays.<Student>asList(new Student(Long.valueOf(1), "name", "email", Gender.MALE)), result);
    }

    @Test
    void testAddStudent() {
        studentController.addStudent(new Student(Long.valueOf(1), "name", "email", Gender.MALE));
    }

    @Test
    void testDeleteStudent() {
        studentController.deleteStudent(Long.valueOf(1));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme