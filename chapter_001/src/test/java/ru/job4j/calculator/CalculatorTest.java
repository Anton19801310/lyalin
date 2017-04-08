package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Class Calculator- элементарный калькулятор".
*@author Lyalin
*@since 06.04.2017
*@version 1.0
*/

public class CalculatorTest {
	/**
	* Test div.
	*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
	* Test Substruct.
	*/
	public void whenSubstructTwoMinusOneThenOne() {
        Calculator calc = new Calculator();
        calc.substruct(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
	/**
	* Test div.
	*/
	public void whenDivTwoDivOneThenOne() {
        Calculator calc = new Calculator();
        calc.div(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
	}
	/**
	* Test multiply.
	*/
	public void whenMultiplyOneMultiplyOneThenOne() {
        Calculator calc = new Calculator();
        calc.multiply(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
	}
}