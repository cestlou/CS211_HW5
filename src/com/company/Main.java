package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fib(12));
    }

    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            int fibo2 = 1;
            int fibo1 = 1;
            int fibonacci = 1;
            for (int i = 3; i <= n; i++) {
                fibonacci = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = fibonacci;
                System.out.println(fibonacci);  
            }
            return fibonacci;

        }
    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}
