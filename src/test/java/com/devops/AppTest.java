package com.devops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(10, App.add(5, 5));
    }
}
