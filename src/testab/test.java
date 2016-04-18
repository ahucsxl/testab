package testab;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		String str = "13abf";
		int len = str.length();
		int sum = 0;
		for(int i = 0; i < len; i++){
			char c = str.charAt(i);
			int n = Character.digit(c, 16);
			sum += n * Math.pow(16, i);
		}
		System.out.println(sum);

	}

}
