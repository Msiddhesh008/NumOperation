package com.example.numoperation.domain;

public class ChainOfResponsiblity {
    String values = "";
    int no;

    public ChainOfResponsiblity(int no) {
        this.no = no;
    }

    public ChainOfResponsiblity() {
    }
    /*public String find() {
        values += new FindFactorial(no).find() + "\n";
        values += new FindNumberOfDigits(no).find() + "\n";
        values += new FindOddEven(no).find() + "\n";
        values += new FindReverseNumber(no).find() + "\n";
        return values;
    }*/

    public String find(FindInterface findInterface) {
        values = findInterface.find();
        return values;
    }
}
