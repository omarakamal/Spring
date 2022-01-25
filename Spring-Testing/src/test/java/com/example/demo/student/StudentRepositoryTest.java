package com.example.demo.student;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class StudentRepositoryTest {
    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Autowired
    private StudentRepository underTest;

    @Test
    void itShouldCheckIfStudentEmailExists() {
        //given
        String email = "omar@gmail.com";
        Student student = new Student(
                "Omar", email, Gender.MALE
        );
        underTest.save(student);

        //when
        boolean expected= underTest.selectExistsEmail(email);

        //then
        assertThat(expected).isTrue();

    }
//    @Test
//    void itShouldCheckIfStudentEmailDoesNotExist() {
//        //given
//        String email = "omar@gmail.com";
//
//
//        //when
//        boolean expected= underTest.selectExistsEmail(email);
//
//        //then
//        assertThat(expected).isFalse();
//
//    }
}