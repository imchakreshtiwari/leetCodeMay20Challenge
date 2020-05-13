package com.example.demo.leethack;

public class RemoveKDigit {

	public String removeKdigits(String num, int ka) {
		if (num.length() == ka) {
			return "0";
		}
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < ka; i++) {
			int k = 0;
			while (k < sb.length() - 1 && sb.charAt(k) < sb.charAt(k + 1)) {
				k++;
			}
			sb.delete(k, k + 1);
		}

		while (sb.charAt(0) == '0' && sb.length() > 1) {
			sb.delete(0, 1);
		}
		if (sb.length() == 0) {
			return "0";
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
