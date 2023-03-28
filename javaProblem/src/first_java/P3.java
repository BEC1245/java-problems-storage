package first_java;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num1 = sc.nextLong(), num2 = sc.nextLong();
		double r = sc.nextDouble();
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
		grith(r);
		width(r);
	}

	static void add(long num1, long num2) {
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
	}
	
	static void sub(long num1, long num2) {
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
	}
	
	static void mul(long num1, long num2) {
		System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
	}
	
	static void div(long num1, long num2) {
		System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
	}
	
	static void grith(double r) {
		System.out.println("grith is " + (r * 2 * Math.PI));
	}
	
	static void width(double r) {
		System.out.println("width is " + (Math.pow(r, 2) * Math.PI));
	}
}
