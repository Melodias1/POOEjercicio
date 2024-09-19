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
	}//constructor
	   

	

// metodo para inscribir alumnos, se hace mediante el objeto de clase student, se verifica primero que no sea un objeto null, de no ser null se agrega a la  lista del curso mediante el metodo .add y se imprime un mensaje
	public void enroll(Student student){
		      //TODO add the student to the collection
			if (student!=null) {
				enrolledStudents.add(student);
				System.out.println("estudiante "+ student.getName() +" agregado con exito");
			}else {
				System.out.println("no se pudo agregar al estudiante");
			}
		   		
		   }// enroll normal
	// sobrecarga de enroll, se obtiene un arreglo de objetos students, el cual se itera por medio de un ciclo foreach que no es un ciclo foreach pero que funciona como un ciclo foreach para cada objeto student del array, y se agrega con la funcion .add
	 public void enroll(Student[] students){
	      //TODO add all the students to the collection
		 
		 for (Student student : students) {
			 if(student!=null) {
				 enrolledStudents.add(student);
			 }else {
				 System.out.println("no se pudo agregar al estudiante");
			 }
			
		}
	   }//enroll Array
// metodo para remover del curso a un alumno, se verifica que el objeto exista en la lista del curso por medio del medoto de la clase array .contains(), de existir se elimina por medio del metodo .remove()
		   public void unEnroll(Student student){
		       //TODO remove this student from the collection
		       // Hint: check if that really is this student
			   if(enrolledStudents.contains(student)) {
				   enrolledStudents.remove(student);
				   System.out.println("el estudiante "+ student.getName()+" fue removido con exito");
			   }else {
				   System.out.println("student doesnt exist in this course");
			   }
		   }//unEnroll
// se obtiene el numero de estudiantes en el curso por medio del metodo .size que cuenta los elementos de un Array list y devuelve un mensaje con el valor
		   public String countStudents(){
		      int total= enrolledStudents.size();
		       return "el total de estudiantes es: "+total;
		   }//countStudents
// metodo para obtener la mejor calificacion del curso, se inicia una variable igualada a 0 de almacenamiento para el valor, se implementa un ciclo foreach que recorre el array list de students y dentro de este se hace una comparacion de student.grade con la variable iniciada, de ser mayor a esta, se asigna como su nuevo valor, de ser igual el nuevo estudiante tomara el lugar, de ser inferior se pasa al siguiente al terminar se imprime un mensaje con el valor del bestGrade	
		   
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
		   }// best grade
		// se calcula el promedio por medio de un ciclo for que r   
		   public void avgGrade() {
			   int suma = 0;
			   int contador=0;
			   double avg =0;
			  for(Student student: enrolledStudents) {
				  suma+=student.getGrade();
				  contador++;
			  }
			  avg= suma/contador;
			  System.out.println("el promedio del grade es: "+ avg);
		   }//avg grade
		   
		   public void isAboveAvg() {
			   
		   }
}
