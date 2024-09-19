package org.generation.classes;

public class Student {

	   
	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;
	       
	       public Student(String firstName, String lastName, int registration, int grade, int year) {
				
				this.firstName = firstName;
				this.lastName = lastName;
				this.registration = registration;
				this.grade = grade;
				this.year = year;
			}
	       
	       public Student(String firstName, String lastName, int registration) {
				this(firstName,lastName,registration,0,1);
				
			}
	       public Student(String firstName, String lastName) {
				this(firstName, lastName,000000,0,1);
				
			}
	       
	       
	       
	       public String printFullName(){
				
	    	      return "el nombre del alumno es: "+ this.firstName+" "+ this.lastName;
	    	   }

	       
	    	   public Boolean isApproved(){
	    	       //TODO implement: should return true if grade >= 60
	    		   if(grade >=60) {
	    			   return true;
	    		   }else {
	    			   return false;
	    		   }
	    	   }

	    	   public void changeYearIfApproved(){
	    	       //TODO implement: the student should advance to the next year if he/she grade is >= 60
	    	       // Make year = year + 1, and print "Congragulations" if the student has been approved
	    		   
	    		   if(isApproved()) {
	    			    this.year=year+1;
	    			    System.out.println("Congratulations");
	    		   }else {
	    			   System.out.println("lo sentimos");
	    		   }
	    	       
	    	   }
	    	   
	    	   public int getGrade() {
	    		   return grade;
	    	   }
	    	   public String getName() {
	    		   return this.firstName+ " "+ this.lastName;
	    	   }
}
