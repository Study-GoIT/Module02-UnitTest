package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SumCalculatorTest {

    SumCalculator calculator;

    @BeforeEach
    public void generateCalculator() {

        calculator = new SumCalculator();

    }

    @ParameterizedTest
    @CsvSource({"1,1","2,3","3,6"})
    public void ResultsTest(int input, int output) {
        Assertions.assertEquals(calculator.sum(input), output, "Incorrect calculation");
    }

    @ParameterizedTest
    @CsvSource({"0"})
    public void ExceptionsTest(int input) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0), "Illegal exception on zero do not work");
    }

}
