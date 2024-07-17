package Ques_3;

public class testing {
	 static void agechecking (int age) throws invalid{
		if(age>18) {
			throw new invalid("Valid age");
		}
		else {
			System.out.println("Invalid age");
		}
		
	}
}
