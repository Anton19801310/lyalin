package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Class Max - максимум из 2-х чисел.
*@author Lyalin.
*@since 11.04.17
*/

public class MaxTest {
	/**
	* Тестируем метод max.
	*/
	@Test
	public void whenFirstBigSecond() {
		Max max = new Max();
       	int result = max.max(2, 1);
		int expected = 2;
		assertThat(result, is(expected));
	}
}