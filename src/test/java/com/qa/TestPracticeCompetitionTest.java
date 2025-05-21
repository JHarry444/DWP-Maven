package com.qa;

import com.qa.maven.TestingPractice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestPracticeCompetitionTest {


    private TestingPractice practice = new TestingPractice();



    @Test
    void testLength() {
        assertEquals(99, this.practice.compete(1).size());
    }

    @Test
    void test34() {
        assertFalse(this.practice.compete(34).contains("34th"));
    }
    @Test
    void testFirst() {
        assertEquals("21st", this.practice.compete(99).get(20));
    }
    @Test
    void testSecond() {
        assertEquals("32nd", this.practice.compete(99).get(31));
    }

    @Test
    void testThird() {
        assertEquals("43rd", this.practice.compete(99).get(42));
    }

    @Test
    void testEleventh() {
        assertEquals("11th", this.practice.compete(99).get(10));
    }

    @Test
    void testTwelfth() {
        assertEquals("12th", this.practice.compete(99).get(11));
    }

    @Test
    void testThirteenth() {
        assertEquals("13th", this.practice.compete(99).get(12));
    }

}
