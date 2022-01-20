package workShop4;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	
	public void add(Student student) 
	{
		
			for (Student student1 : students) {
				if(student1.getIndentityNumber()==student.getIndentityNumber()) {
					System.out.println("You have already registered.");
					return;
				}else {
					this.students.add(student);
				}
			}
	}
	
	public void delete(int id) 
	{
		Student studentToDelete=new Student();
	
		for (Student student : students) {
			if(student.getId()==id) {
				studentToDelete=student;
			}
		}
		
		students.remove(studentToDelete);
	}
	
	
	public void update(Student updatedStudent) 
	{
		for (Student student : students) 
		{
			if(student.getId()==updatedStudent.getId()) 
			{
				student=updatedStudent;
			}
		}
	}
	
	
	public ArrayList<Student> getAll() 
	{
		return this.students;
	}
	
	
	
	

}
