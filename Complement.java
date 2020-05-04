package com.example.demo.javaprogram;

public class Complement {

	// complement of a number
		public static int findComplement(int num) {

			String binary = "";
			String newbinary = "";
			int ans = 0;
			while (num > 0) {
				int rem = num % 2;
				binary += rem;
				num = num / 2;
			}
			for (int i = 0; i < binary.length(); i++) {
				if (binary.charAt(i) == '1') {
					newbinary += '0';
				} else {
					newbinary += '1';
				}
			}
			for (int i = 0; i < newbinary.length(); i++) {
				char digit = newbinary.charAt(i);
				int newn = Integer.parseInt(String.valueOf(digit));
				ans += newn * Math.pow(2, i);
			}

			return ans;
		}
		public static void main(String[] args) {
			findComplement(5);
		}
}
