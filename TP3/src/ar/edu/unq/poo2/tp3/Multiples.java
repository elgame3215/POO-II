package ar.edu.unq.poo2.tp3;

public class Multiples {
	public int getBiggestMultipleOf(int num1, int num2) {
		int max = Math.max(num1, num2);
		
		for (int i = 1000; max < i; i = prevMultipleOf(i, max)) {
			if (i % num1 == 0 && i % num2 == 0) {
				return i;
			}
		}
		return -1;
	}

	private int prevMultipleOf(int i, int max) {
		if (i % max == 0) {
			return i - max;
		} 
		return i - i % max;
	}
}
