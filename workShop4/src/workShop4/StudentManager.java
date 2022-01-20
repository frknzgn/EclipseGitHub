package workShop4;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	
	public void add(Student addStudent) 
	{
		
			for (Student student : students) {
				if(student.getIndentityNumber()==addStudent.getIndentityNumber()) {
					System.out.println("You have tried to add already registered student..");
					return;
				}
			}
			
			this.students.add(addStudent);
			System.out.println("Student " + addStudent.getFirstName() + " added!");
	}
	
	public void delete(int id) 
	{
		Student studentToDelete=new Student();
	
		for (Student student : students) {
			if(student.getId()==id) {
				studentToDelete=student;
			}
		}
		System.out.println("Student " + studentToDelete.getFirstName() + " is deleted!");
		students.remove(studentToDelete);
	}
	
	
	public void update(Student updatedStudent) 
	{
		for (Student student : students) {
			if(student.getId() == updatedStudent.getId()) {
				
				students.set(students.indexOf(student), updatedStudent);
				System.out.println("Student " + student.getId() + " is updated");
				break;
				
			}else{
				System.out.println("There is no student to update");
			}
				
		}
	}
	
	
	public ArrayList<Student> getAll() 
	{
		return this.students;
	}
	
	
	
	

}
