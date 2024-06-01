package com.nt.factory;

import com.nt.comp.Employee;
import com.nt.comp.Food;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class PersonFactory {
    public static Person getPerson(String type) {
        Food food = new Food(); // Assuming all persons need food
        Person per = null;
        if (type.equalsIgnoreCase("emp"))
            per = new Employee(food);
        else if (type.equalsIgnoreCase("stud"))
            per = new Student(food);
        else
            throw new IllegalArgumentException("Invalid person type");
        return per;
    }
}
