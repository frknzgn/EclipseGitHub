package arrayLists;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		
		System.out.println(students.size());
		students.add("selo");
		students.add("furkan");
		System.out.println(students.size());
		students.add("engin");
		System.out.println(students.contains("engin"));
		System.out.println(students.get(1));
		
		System.out.println(students.get(0));
		students.remove(0);
		System.out.println(students.get(0));
		
		

	}

}


//