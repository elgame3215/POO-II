package ar.edu.unq.poo2.tp3;

import java.util.List;

public class NumberDecomposer {
	public int getMaxOddDigits(List<Integer> nums) {
		int max = nums.getFirst();

		for (int i = 1; i < nums.size(); i++) {
			int cur = nums.get(i);
			max = getMaxOddDigitsBetween(cur, max);
		}
		return max;
	}

	protected int getMaxOddDigitsBetween(int num1, int num2) {
		int num1OddDigits = getOddDigitsFrom(num1);
		int num2OddDigits = getOddDigitsFrom(num2);
		
		if (num1OddDigits < num2OddDigits) {
			return num2;
		} else {
			return num1;
		}
	}

	protected int getOddDigitsFrom(int num) {
		int oddDigitsCount = 0;
		for (int i = num; 1 < i; i /= 10) {
			if (i % 2 == 0) oddDigitsCount++;
		}
		return oddDigitsCount;
	}
}
