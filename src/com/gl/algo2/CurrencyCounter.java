package com.gl.algo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CurrencyCounter {

	public static void main(String[] args) {
		Integer[] denominations = { 200, 20, 2000, 10, 500, 100, 50, 1 };
		Arrays.sort(denominations, Collections.reverseOrder());
		for (Integer value : denominations) {
			System.out.println("available denominations: " + value);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the amount");

		int totalAmount = sc.nextInt();
		int quotient = 0;
		LinkedHashMap<Integer, Integer> denoCount = new LinkedHashMap<>();
		for (int i : denominations) {
			quotient = totalAmount / i;
			if (quotient >= 1) {
				denoCount.put(i, (int) quotient);
				totalAmount = totalAmount % i;
			}
		}

		for (Integer hashObj : denoCount.keySet()) {
			System.out.println("denomination is : " + hashObj + " & count is : " + denoCount.get(hashObj));

		}

	}

}
