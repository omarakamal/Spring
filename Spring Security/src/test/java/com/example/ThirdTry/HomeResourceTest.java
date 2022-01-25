package com.example.ThirdTry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeResourceTest {
    HomeResource homeResource = new HomeResource();

    @Test
    void testHome() {
        String result = homeResource.home();
        Assertions.assertEquals("<h1>Welcome</h1>", result);
    }

    @Test
    void testUser() {
        String result = homeResource.user();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testAdmin() {
        String result = homeResource.admin();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme