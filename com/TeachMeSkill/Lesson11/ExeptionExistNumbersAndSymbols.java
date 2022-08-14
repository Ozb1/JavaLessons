package com.TeachMeSkill.Lesson11;

public class ExeptionExistNumbersAndSymbols extends Exception {
    public ExeptionExistNumbersAndSymbols(String error, String numberDocument) {
        System.out.println("Numbers and symbols 1a2b didn't exist ");
    }
}