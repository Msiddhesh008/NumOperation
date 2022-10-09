package com.example.numoperation.domain;

public class FindFactorial implements FindInterface {
    int factorial_udv;
    int fact;

    public FindFactorial(int no) {
        factorial_udv = no;
        fact = 1;
    }

    @Override
    public String find() {
        while (factorial_udv > 0) {
            fact = fact * factorial_udv;
            factorial_udv--;
        }
        return "Factorial of number is : " + fact;
    }
}
