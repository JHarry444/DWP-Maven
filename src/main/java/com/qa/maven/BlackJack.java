package com.qa.maven;

public class BlackJack {


    //    create a method that takes in two numbers and returns the closest to 21 without going over
//    if both players are over return 0
    public int play(int p1, int p2) {
        if (p1 < 0 || p2 < 0) throw new InvalidNumberException();
        if (p1 > 21 && p2 > 21) return 0;
        else if (p1 > 21) return p2;
        else if (p2 > 21) return p1;
        else return Math.max(p1, p2);
    }
}
