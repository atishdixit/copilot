package com.copilot.demo;

public class Doubts {
    //find greatest common divisor of two numbers
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
