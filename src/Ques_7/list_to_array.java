package Ques_7;

import java.util.LinkedList;
import java.util.List;

public class list_to_array {
	public static void main(String[] args) {
		List<String> list1=new LinkedList<String>();
		list1.add("Harini");
		list1.add("Lavanya");
		list1.add("Ramesh");
		list1.add("Akash");
		list1.add("Abinaya");
		list1.add("Singh");
		list1.add("Sruti");
		list1.add("Priya");
		System.out.println("list : "+list1);
		String[] arr=new String[list1.size()];
		for(int i=0;i<list1.size();i++) {
			arr[i]=list1.get(i);
		}
		for(String output:arr) {
			System.out.print(output+" ");
		}
		
		
	}

}
