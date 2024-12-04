package Pratice;

import java.util.Scanner;

public class Shifting {
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
     	for(int i=0;i<k;i++) {
    		temp[i]=arr[i];
    	}
     	for(int i=0;i<n-k;i++) {
    		arr[i]=arr[i+k];
    		}
     	for(int i=n-k;i<n;i++) {
    		arr[i]=temp[i-n+k];
    		
    	}
    	System.out.print("Array element are : ");
    	for(int i=0;i<n;i++) {
    	    System.out.print(arr[i]+" ");
    	}
 }
}
