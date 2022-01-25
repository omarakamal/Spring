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

class StudentServiceTest6 {
    @Mock
    StudentRepository studentRepository;
    @InjectMocks
    StudentService studentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetAllStudents() {
        List<Student> result = studentService.getAllStudents();
        Assertions.assertEquals(Arrays.<Student>asList(new Student(Long.valueOf(1), "name", "email", Gender.MALE)), result);
    }

    @Test
    void testAddStudent() {
        when(studentRepository.selectExistsEmail(anyString())).thenReturn(Boolean.TRUE);

        studentService.addStudent(new Student(Long.valueOf(1), "name", "email55", Gender.MALE));
    }

    @Test
    void testDeleteStudent() {
        studentService.deleteStudent(Long.valueOf(1));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme