package Ques_2;
import java.util.Scanner;
public class String_OBE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ::");
		String a=sc.nextLine();
		System.out.println("The string value entered is ::"+a);
		System.out.print(a.charAt(100));
	}
}
