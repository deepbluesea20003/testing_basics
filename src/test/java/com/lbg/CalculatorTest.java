package com.lbg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void input_two_positive_result_positive_number() {
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
    void subtract() {

    }

    @Test
    void remainingPercentage() {

    }
}