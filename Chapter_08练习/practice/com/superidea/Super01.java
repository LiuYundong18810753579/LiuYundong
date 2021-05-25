package com.superidea;

public class Super01 {
    public static void main(String[] args) {
        FIB a = new FIB();
        int b = a.fib(20);
        System.out.println(b);
        System.out.println("hello");
    }
}

class FIB {
    public int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {

            return fib(n - 1) + fib(n - 2);
        }
    }
}