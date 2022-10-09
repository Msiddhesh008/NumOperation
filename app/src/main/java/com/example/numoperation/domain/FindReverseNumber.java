package com.example.numoperation.domain;

public class FindReverseNumber implements FindInterface {
    int reverse_udv;
    int rem=0, rev=0;

    public FindReverseNumber(int no) {
        reverse_udv = no;
    }

    @Override
    public String find() {
        while (reverse_udv > 0) {
            rem = reverse_udv % 10;
            rev = rev * 10 + rem;
            reverse_udv /= 10;
        }
        return "Reverse of number is : " + rev;


    }
}
