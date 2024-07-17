package Ques_2;
import java.util.Scanner;
public class Array_OBE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.print("Enter the values:: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("--------------------------------------------");
		System.out.println(arr[n+5]);
	}

}
