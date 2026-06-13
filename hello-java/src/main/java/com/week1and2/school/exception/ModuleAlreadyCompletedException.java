package com.week1and2.school.exception;

public class ModuleAlreadyCompletedException extends RuntimeException {
    public ModuleAlreadyCompletedException() {
        super("module the student has already passed");
    }
}
