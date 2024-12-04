package Pratice;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of element of array  : ");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter array element :");
		int temp;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Sort");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
