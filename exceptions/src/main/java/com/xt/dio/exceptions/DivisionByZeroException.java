package com.xt.dio.exceptions;

public class DivisionByZeroException extends Exception {

    private int numbered;
    private int denominator;

    public DivisionByZeroException(String message, int numbered, int denominator) {
        super(message);
        this.numbered = numbered;
        this.denominator = denominator;
    }
}
