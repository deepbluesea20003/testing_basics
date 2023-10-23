package com.lbg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_two_positive_result_positive_number() {
        // arrange
        Calculator cut = new Calculator();
        double val1 = 4;
        double val2 = 11;
        double expectedResult = 15;

        // act
        double actualResult = cut.add(val1,val2);

        // assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void subtract_two_positive_result_positive_number() {
        Calculator cut = new Calculator();
        double val1 = 10;
        double val2 = 7;
        double expectedResult = 3;

        double actualResult = cut.subtract(val1,val2);
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void remaining_percent_two_positive_result_positive() {
        Calculator cut = new Calculator();
        double val1 = 100;
        double val2 = 40;
        double expectedResult = 60;

        double actualResult = cut.remainingPercentage(val1,val2);
        assertEquals(expectedResult,actualResult);
    }
}