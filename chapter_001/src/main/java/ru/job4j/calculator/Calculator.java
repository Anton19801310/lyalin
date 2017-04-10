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
	* @param first - args.
	* @param second - args.
	*/
	public void add(double first, double second) {
        this.result = first + second;
    }
	/**
	* Метод вычетания.
	* @param first - args.
	* @param second - args.
	*/
	public void substruct(double first, double second) {
        this.result = first - second;
    }

	/**
	* Метод деления.
	* @param first - args.
	* @param second - args.
	*/
    public void div(double first, double second) {
		this.result = first / second;
    }

	/**
	* Метод умножения.
	* @param first - args.
	* @param second - args.
    */
	public void multiple(double first, double second) {
        this.result = first * second;
    }

	/**
	*  Калькулятор.
	* @return calc result.
	*  Метод вывод результата.
    */
    public double getResult() {
        return this.result;
    }
}