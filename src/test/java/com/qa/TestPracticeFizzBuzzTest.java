package com.qa;

import com.qa.maven.TestingPractice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPracticeFizzBuzzTest {


    private TestingPractice practice = new TestingPractice();



    @Test
    void testFizz() {
        assertEquals("Fizz", this.practice.fizzBuzz(9));
    }


    @Test
    void testBuzz() {
        assertEquals("Buzz", this.practice.fizzBuzz(10));
    }

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", this.practice.fizzBuzz(15));
    }


    @Test
    void testNumber() {
        int number = 43;
        assertEquals(String.valueOf(number), this.practice.fizzBuzz(number));
    }
}
