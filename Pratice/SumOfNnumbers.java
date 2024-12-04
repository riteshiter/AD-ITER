package Pratice;
import java.util.Scanner;
public class SumOfNnumbers {
    public static void main(String []args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length of array:");
       int n=sc.nextInt();
   	   int arr[]=new int[n];
   	   System.out.println("Enter array element : ");
   	   for(int i=0;i<n;i++) {
   	   arr[i]=sc.nextInt();
     	}
       int sum=0;
       for(int i=0;i<n;i++) {
	    sum+=arr[i];
      }
      System.out.println("Sum is : "+sum);
  }
}
