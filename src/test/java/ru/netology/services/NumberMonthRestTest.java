package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberMonthRestTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/DataTest.csv")
    public void testCalculateNumberMonthRest1(int expected, int income, int expenses, int threshold) {
        NumberMonthRest service = new NumberMonthRest();

       int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);

    }

}