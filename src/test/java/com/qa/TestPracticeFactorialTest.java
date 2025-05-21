package com.qa;

import com.qa.maven.TestingPractice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPracticeFactorialTest {


    private TestingPractice practice = new TestingPractice();



    @Test
    void test120(){
        assertEquals("5!", this.practice.reverseFactorial(120));
    }

    @Test
    void test150() {
            assertEquals("NONE", this.practice.reverseFactorial(150));
    }


    @Test
    void test1() {
        assertEquals("1!", this.practice.reverseFactorial(1));
    }

    @Test
    void test2() {
        assertEquals("2!", this.practice.reverseFactorial(2));
    }

    @Test
    void test6() {
        assertEquals("3!", this.practice.reverseFactorial(6));
    }
}
