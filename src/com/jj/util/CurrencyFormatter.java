package com.jj.util;

public class CurrencyFormatter {

	private static String[] DIGIT_CONSTANTS = {"", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
	private static String[] TEN_SERIES_CONSTANTS = {"", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTTEEN", "NINETEEN"};
	private static String[] TENS_CONSTANTS = {"", "", "TWENTY", "THIRTY", "FOURTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};
	private static String[] PLACE_CONSTANTS = { "", "HUNDRED", "THOUSAND", "LAKH", "CRORE"};
	
	public static String format(int amount) { 
		String formattedText = "";
		int temp = amount;
		int remain = 0;
		int index = 0;
		
		while(temp > 0) {
			if(index == 1) {
				remain = temp % 10;
				temp = temp / 10;
			} else {
				remain = temp % 100;
				temp = temp / 100;
			}
			formattedText = formatTextTill99(remain) + " "+ PLACE_CONSTANTS[index] + " " + formattedText;
			index++;
		}

		return formattedText.toString();
	}
	
	private static String formatTextTill99(int num) {
		String formattedText = "";
		if(num < 100) {
			if(num > 10 && num < 20) {
				formattedText = TEN_SERIES_CONSTANTS[num%10];
			} else {
				formattedText = TENS_CONSTANTS[num/10] + " " + DIGIT_CONSTANTS[num%10];
			}
		}
		return formattedText;
	}
}
