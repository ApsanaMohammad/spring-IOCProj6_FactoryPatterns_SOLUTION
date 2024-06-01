package com.nt.test;

import com.nt.comp.Person;
import com.nt.factory.PersonFactory;
public class College {

	public static void main(String[] args) {
		//college needs student
				Person st= PersonFactory.getPerson("stud");
				st.work();

	}

}