package Pratice;
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of fibonacii series : ");
		int n=sc.nextInt();
		int i=1;
		int a=0;
		int b=1;
		int c=0;
		while(i<n) {
			c=a+b;
			a=b;
			b=c;
			i++;
		}
		System.out.println(c);
	}
}
