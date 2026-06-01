package com.school.exception;

public class InvalidGradeException extends RuntimeException {

    public InvalidGradeException(int grade) {
        super(String.format("the input accepts values from 0 to 100. But a value %d was provided", grade));

    }
}
