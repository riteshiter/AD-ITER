package Pratice;

import java.util.Scanner;

public class SelectionSort {
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
		int min;
		int k=1;
		for(int i=0;i<arr.length-1;i++) {
			min=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					k=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
			System.out.println();
			System.out.println("After Sorting");
			for(int l=0;l<n;l++) {
				System.out.print(arr[l]+" ");
			
		}
   }
}