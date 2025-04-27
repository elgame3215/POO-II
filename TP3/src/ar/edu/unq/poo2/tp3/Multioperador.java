package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;

public class Multioperador {
	public int getAddition(ArrayList<Integer> list) {
		int count = 0;
		for (int num : list) {
			count += num;
		}
		return count;
	}

	public int getSubstraction(ArrayList<Integer> list) {
		int count = 0;
		for (int num : list) {
			count -= num;
		}
		return count;
	}

	public int getMultiplication(ArrayList<Integer> list) {
		int count = 1;
		for (int num : list) {
			count *= num;
		}
		return count;
	}
}
