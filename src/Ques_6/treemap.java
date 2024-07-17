package Ques_6;

import java.util.Map;
import java.util.TreeMap;

public class treemap {
	public static void main(String[] args) {
		TreeMap<Integer,String> tree1=new TreeMap<Integer,String>();
		tree1.put(1,"Harini");
		tree1.put(3, "Ramesh");
		tree1.put(5, "Priya");
		tree1.put(2, "Oviya");
		tree1.put(4,"vasanth");
		System.out.println(tree1);
		
		for(String name:tree1.values()) {
			System.out.println(name);
		}
		
		
	}
}
//In tree map sort occurs at key by default.So in next class name_treemap i kept String <employee_name> as key and sorted in alphabetical order. 
