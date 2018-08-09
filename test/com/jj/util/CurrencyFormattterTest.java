package com.jj.util;
import org.junit.Test;

import com.jj.util.CurrencyFormatter;

public class CurrencyFormattterTest {

	@Test
	public void testBelowHundredAmount() {
		int amount = 78;
		String result = CurrencyFormatter.format(amount);
		System.out.println(result);
	}
	
	@Test
	public void testHundredAmount() {
		int amount = 142;
		String result = CurrencyFormatter.format(amount);
		System.out.println(result);
	}
	
	@Test
	public void testThousandsAmount() {
		int amount = 29719;
		String result = CurrencyFormatter.format(amount);
		System.out.println(result);
	}
	
	@Test
	public void testTenLaksAmount() {
		int amount = 1519114;
		String result = CurrencyFormatter.format(amount);
		System.out.println(result);
	}
}
