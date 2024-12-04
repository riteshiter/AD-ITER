package Pratice;

import java.util.Scanner;

public class BinarySearchInArray {
	public static int main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of element of array  : ");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter array element :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEnter the number you want to search");
		int f=sc.nextInt();
		int l=0;
		int r=n-1;  
		while(l<=r) {
			int m=(l+r)/2;
			if(arr[m]==f) {
				return m;
			}
			else if(arr[m]>f) {
				r=m-1;
			}
			else {
				l=m+1;
			}
		}
		return -1;
	}
}
