package Pratice;
import java.util.Scanner;
public class LinearSearchInArray {
	public static void main(String[]args) {
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
		int m=sc.nextInt();
		for(int i=0;i<n;i++){
			if(arr[i]==m) {
			   System.out.println("Number is found at the index :"+i);
			}
			else {
				System.out.println("NOT FOUND");
			}
		}
	}
}
