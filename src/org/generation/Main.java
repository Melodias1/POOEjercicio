package org.generation;

import org.generation.classes.Courses;
import org.generation.classes.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student eli = new Student("eliza", "Martinez", 02020, 60, 1);
		
		Student luis = new Student("luis", "ramirez", 03030, 80, 1);
		Student vale = new Student("vale", "martinez", 06060, 100, 1);
		Courses mate = new  Courses("mate", "JC", 1);
				
		System.out.println(eli.printFullName());
		eli.changeYearIfApproved();
		mate.enroll(eli);
		mate.enroll(luis);
		mate.enroll(vale);
		System.out.println(mate.countStudents());
		mate.bestGrade();
		
		
	}

}
