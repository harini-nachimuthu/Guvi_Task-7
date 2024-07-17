package Ques_5;
import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class array_list {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list1=new ArrayList<String>();
		System.out.println("Enter the String details :: ");
		for(int i=0;i<3;i++) {
			String input=sc.nextLine();
			list1.add(input);
		}
		System.out.print("Array String list :: ");
		System.out.println(list1);
		System.out.println("=========================================================");
		list1.clear();
		System.out.print("Array String listaftre removal :: ");
		System.out.println(list1);
		
	}

}
