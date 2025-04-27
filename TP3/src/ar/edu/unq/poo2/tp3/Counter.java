package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> list = new ArrayList<Integer>();

	public void addNumber(int n) {
		list.add(n);
	}
	
	public int getOddOcurrences() {
		int count = 0;
		for (int n: list) {			
			if (n % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public int getEvenOcurrences() {
		int count = 0;
		for (int n: list) {			
			if (n % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	
	public int getMultiplesOcurrences(int num) {
		int count = 0;
		for (int n: list) {			
			if (num % n == 0) {
				count++;
			}
		}
		return count;
	}
}
