package org.generation.classes;

import java.util.ArrayList;
import java.util.List;

public class Courses {

	String courseName;
	String professorName;
	int year;
	List<Student> enrolledStudents= new ArrayList<Student>();
	
	
	
	   public Courses(String courseName, String professorName, int year) {
		
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}
	   

	


	public void enroll(Student student){
		      //TODO add the student to the collection
			if (student!=null) {
				enrolledStudents.add(student);
				System.out.println("estudiante "+ student.getName() +" agregado con exito");
			}else {
				System.out.println("no se pudo agregar al estudiante");
			}
		   		
		   }
	
	 public void enroll(Student[] students){
	      //TODO add all the students to the collection
		 
		 for (Student student : students) {
			 if(student!=null) {
				 enrolledStudents.add(student);
			 }else {
				 System.out.println("no se pudo agregar al estudiante");
			 }
			
		}
	   }

		   public void unEnroll(Student student){
		       //TODO remove this student from the collection
		       // Hint: check if that really is this student
			   if(enrolledStudents.contains(student)) {
				   enrolledStudents.remove(student);
				   System.out.println("el estudiante "+ student.getName()+" fue removido con exito");
			   }else {
				   System.out.println("student doesnt exist in this course");
			   }
		   }

		   public String countStudents(){
		      int total= enrolledStudents.size();
		       return "el total de estudiantes es: "+total;
		   }
		   
		   public void bestGrade(){
			   int bestGrade= 0;
			   String nombreStudent ="";
		       for (Student student : enrolledStudents) {
		    	   
				
				if(student.getGrade()>=bestGrade) {
					bestGrade=student.getGrade();
					nombreStudent=student.getName();
				}
				
			}
		       System.out.println("el mejor promedio es de "+ nombreStudent+" con "+ bestGrade);   
		   }
}
