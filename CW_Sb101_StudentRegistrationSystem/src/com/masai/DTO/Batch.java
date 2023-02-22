package com.masai.DTO;

import java.util.Set;

public interface Batch {

	public int getBatchId();



	public void setBatchId(int batchId) ;



	public int getSeats();



	public void setSeats(int seats);



	public int getCourseId() ;



	public void setCourseId(int courseId) ;



	public Set<Student> getStudent() ;



	public void setStudent(Set<Student> student);
	
	



	public Course getCourse();


	public void setCourse(Course course) ;


}
