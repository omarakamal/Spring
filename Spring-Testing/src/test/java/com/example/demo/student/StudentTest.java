package com.example.demo.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {
    //Field gender of type Gender - was not mocked since Mockito doesn't mock enums
    Student student = new Student(Long.valueOf(1), "name", "email", Gender.MALE);

    @Test
    void testEquals() {
        boolean result = student.equals("o");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testCanEqual() {
        boolean result = student.canEqual("other");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testHashCode() {
        int result = student.hashCode();
        Assertions.assertEquals(0, result);
    }

    @Test
    void testSetId() {
        student.setId(Long.valueOf(1));
    }

    @Test
    void testSetName() {
        student.setName("name");
    }

    @Test
    void testSetEmail() {
        student.setEmail("email");
    }

    @Test
    void testSetGender() {
        student.setGender(Gender.MALE);
    }

    @Test
    void testToString() {
        String result = student.toString();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme