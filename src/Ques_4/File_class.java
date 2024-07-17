package Ques_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class File_class {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		File f1=new File("file1.txt");
		try {
			FileReader fr1=new FileReader(f1);
			System.out.println("try=================");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
