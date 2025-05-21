package com.qa.maven;

import java.util.ArrayList;
import java.util.List;

public class TestingPractice {


    public String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    //    public String reverseFactorial(int number) {
//        int current = 1;
//
//        for (int i = 1; i <= number; i++) {
//            current *= i;
//            if (current == number) {
//                return i + "!";
//            } else if (current > number) {
//                break;
//            }
//        }
//        return "NONE";
//    }
    public String reverseFactorial(float number) {
        if (number == 1) return 1 + "!";
        int fact = 0;
        while (number > 1) {
            number /= ++fact;
        }
        if (number == 1) return fact + "!";
        else return "NONE";
    }

    public List<String> compete(int place) {
        List<String> places = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i == place) continue;
            else if ((i % 10 > 3 || i % 10 == 0) || (i > 10 && i < 14)) places.add(i + "th");
            else if (i % 10 == 1) places.add(i + "st");
            else if (i % 10 == 2) places.add(i + "nd");
            else places.add(i + "rd");
        }

        return places;
    }
}
