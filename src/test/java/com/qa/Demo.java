package com.qa;

import com.qa.maven.BlackJack;
import com.qa.maven.InvalidNumberException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Demo {

    @Test
    void testPass() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void testFail() {
        assertEquals(2, 1 * 1);
    }


    private BlackJack blackJack;
    private static List<Integer> testData;

    @BeforeAll
    static void setupOnce() {
//        runs once before tests start
        testData = new ArrayList<>();
        testData.add(1);
        testData.add(2);
        testData.add(3);
    }

    @BeforeEach
        // runs before every test
    void setUp() {
        this.blackJack = new BlackJack();
    }

    @Test
    void bothBust() {
        assertEquals(0, this.blackJack.play(22, 25));
    }

    @Test
    void p1Bust() {
        assertEquals(19, this.blackJack.play(22, 19));
    }

    @Test
    void p2Bust() {
        assertEquals(17, this.blackJack.play(17, 25));
    }

    @Test
    void p1Wins() {
        assertEquals(20, this.blackJack.play(20, 19));
    }

    @Test
    void p2Wins() {
        assertEquals(18, this.blackJack.play(16, 18));
    }

    @Test
    void exceptionThrown() {
        assertThrows(InvalidNumberException.class, () -> this.blackJack.play(-1, -2));
    }
}
