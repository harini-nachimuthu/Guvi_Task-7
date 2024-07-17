package Ques_6;

import java.util.TreeMap;

public class name_treemap {
	public static void main(String[] args) {
		TreeMap<String,Integer> tree1=new TreeMap<String,Integer>();
		tree1.put("Harini",3);
		tree1.put("Ramesh",2);
		tree1.put("Priya",5);
		tree1.put("Oviya",1);
		tree1.put("Vasanth",4);
		System.out.println(tree1);
		
		for(String name:tree1.keySet()) {
			System.out.println(name);
		}
		
		
	}
}
