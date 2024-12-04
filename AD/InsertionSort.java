package Pratice;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of element of array  : ");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter array element :");
		int key;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Sort");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int j=0;j<n;j++) {
			key=arr[j];
			int i=j-1;
			while(i>0&&arr[i]>key) {
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}
    }
}