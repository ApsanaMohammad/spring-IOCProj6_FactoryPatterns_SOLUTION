package com.nt.comp;

public class Student extends Person {
    private int rollno;
    private String course;
    
    
  //HAS-A property composition
    private Food food;
    
    public Student(Food food) {
    	System.out.println("Student::one param constructor");
    	this.food=food;
    }
    
	@Override
	public void work() {
		System.out.println("Student is studying btech"+food);

	}

}
