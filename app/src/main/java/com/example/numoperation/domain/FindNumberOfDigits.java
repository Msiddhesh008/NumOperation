package com.example.numoperation.domain;

public class FindNumberOfDigits implements FindInterface {
    int num;
    int digit;

    public FindNumberOfDigits(int no) {
        num = no;
        digit = 0;
    }

    @Override
    public String find() {
        while (num > 0) {
            num /= 10;
            digit++;
        }
        return "Number of digit is : " + digit;
    }
}
