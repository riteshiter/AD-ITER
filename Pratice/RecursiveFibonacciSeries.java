package Pratice;

import java.util.Scanner;

public class RecursiveFibonacciSeries {
	public static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of fibonacii series : ");
		int n=sc.nextInt();
		System.out.println(fib(n));
	}
}
