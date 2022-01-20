package workShop4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Student student1= new Student(1,"furkan","ozgun","1");
		Student student2= new Student(2,"hüseyin","emre","2");
		Student student3= new Student(3,"engin","demirog","3");
		Student student4= new Student(4,"aa","aa","4");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		studentManager.add(student4);
		
		for (Student student : studentManager.getAll()) {
			System.out.println(student.getFirstName());
		}
		studentManager.delete(1);
		studentManager.add(student1);
		
		for (Student student : studentManager.getAll()) {
			System.out.println(student.getFirstName());
		}
		
		

	}

}
