package Pratice;
import java.util.Scanner;
public class MaxAndMinInArray {
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
    	int max=arr[0];
    	int min=arr[0];
    	for(int i=0;i<n;i++) {
    	    if(arr[i]>max) {
    	    	max=arr[i];
    	    }
    	}
    	for(int i=0;i<n;i++) {
    	    if(arr[i]<min) {
    	    	min=arr[i];
    	    }
    	}
    	System.out.println();
    	System.out.println("MAX=="+max);
    	System.out.println("MIN=="+min);
    }
}
