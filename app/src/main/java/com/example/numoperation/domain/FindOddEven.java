package com.example.numoperation.domain;

public class FindOddEven implements FindInterface {
    int even_odd_udv;

    public FindOddEven(int no) {
        even_odd_udv = no;
    }

    @Override
    public String find() {
        if (even_odd_udv % 2 == 0) {
            return "Number is Even";
        } else {
            return "Number is Odd";
        }
    }
}
