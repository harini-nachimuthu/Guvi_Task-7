package Ques_1;
import java.util.Scanner;

public class Ques_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a  :: ");
		int a= sc.nextInt();
		System.out.println("Entered the value of a is :: " +a);
		System.out.println("Enter the value of b  :: ");
		int b= sc.nextInt();
		System.out.println("Entered the value of b is :: " +b);
		try {
			int c=a/b;
			System.out.println("c:: "+c);
		}catch(ArithmeticException e) {
			System.out.println("The value entered is not correct any number cannot be divided by 0 and would result in arithmetic exception");
		}finally {
			System.out.println("-------------The code reached last line------------");
		}
		
		
	}

}
