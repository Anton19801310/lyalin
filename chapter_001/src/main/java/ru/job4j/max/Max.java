package ru.job4j.max;

/**
*Class Max - максимум из 2-х чисел.
*@author Lyalin.
*@since 11.04.17
*/

public class Max {
	/**
	* @param first - первая переменная.
	* @param second - вторая переменная.
	* @return max from first and second.
	*/
	public int max(int first, int second) {
		return (first > second) ? first : second;
	}
}