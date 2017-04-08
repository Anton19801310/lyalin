package ru.job4j.calculator;

/**
*Class Calculator- элементарный калькулятор".
*@author Lyalin
*@since 06.04.2017
*@version 1.0
*/
public class Calculator {
	/**
	*  Калькулятор.
	*/
	private double result;
	/**
	* Метод сложения.
	* @param first.
	* @param second.
	*/
	public void add(double first, double second) {
        this.result = first + second;
    }
	/**
	* Метод вычетания.
	* @param first.
	* @param second.
	*/
	public void substruct(double first, double second) {
        this.result = first - second;
    }

	/**
	* Метод деления.
	*/
    public void div(double first, double second) {
		this.result = first / second;
    }

	/**
	* Метод умножения.
    */
	public void multiple(double first, double second) {
        this.result = first * second;
    }

	/**
	*  Калькулятор.
	*  Метод вывод результата.
    */
    public double getResult() {
        return this.result;
    }
}