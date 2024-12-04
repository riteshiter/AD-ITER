package Pratice;

import java.util.Scanner;

public class RightSifting {
    public static void main(String[]args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter length of array : ");
    	int n=sc.nextInt();
    	int arr[]=new int[n];
    	System.out.println("Enter array element : ");
    	for(int i=0;i<n;i++) {
    		arr[i]=sc.nextInt();
    	}
    	System.out.print("Array element are : ");
    	for(int i=0;i<n;i++) {
    	    System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    	System.out.println("Enter the number of sifting :");
    	int k=sc.nextInt();
    	
        int temp[]=new int[k];
        int arr2[];
        arr2=arr;
    	for(int i=n-k;i<n;i++) {
    	     temp[i-n+k]=arr[i];
    	}
    	for(int i=0;i<n-k;i++) {
    	    arr[i+k]=arr2[i];
    	}
    	for(int i=0;i<k;i++) {
    	    arr[i]=temp[i];
    	}
    	System.out.print("Array element are : ");
    	for(int i=0;i<n;i++) {
    	    System.out.print(arr[i]+" ");
    	}
   }
}
