package com.nt.comp;

public class Employee extends Person {
    private String desig;
    private float salary;
    
    //HAS-A property composition
    private Food food;
    
    public Employee(Food food) {
    	System.out.println("Employee::one param constructor");
    	this.food=food;
    }
	@Override
	public void work() {
		System.out.println("employee is working on software development"+food);

	}

}
