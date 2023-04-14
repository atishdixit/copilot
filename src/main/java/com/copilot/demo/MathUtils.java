package com.copilot.demo;

public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
    public static int mod(int a, int b) {
        return a % b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static int cube(int a) {
        return a * a * a;
    }
    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
    public static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        }
        return a;
    }
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += i;
        }
        return result;
    }
    public  static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectSquare(int a) {
        int sqrt = (int) Math.sqrt(a);
        return sqrt * sqrt == a;
    }


    public static int testIt(int a){
        int p = 0;
        p = p*a;

        return p;
    }
}
